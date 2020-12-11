package JDBCTest01;

import JDBCTest01.util.DataBaseClose;
import JDBCTest01.util.DataBaseConnection_comment;
import JDBCTest01.util.DataBaseConnection_merchant;
import java.sql.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.text.SimpleDateFormat;



import java.text.ParseException;

import static java.lang.Math.pow;

public class TestComment {
    public static void main(String[] args) throws SQLException, ParseException {

        Connection con_merchant = null;
        Connection con_comment = null;
        DataBaseConnection_comment dataBaseConnection_comment = new DataBaseConnection_comment();
        DataBaseConnection_merchant dataBaseConnection_merchant = new DataBaseConnection_merchant();
        DataBaseClose dbclose = new DataBaseClose();
        con_merchant = dataBaseConnection_merchant.doConnction(con_merchant);
        con_comment = dataBaseConnection_comment.doConnction(con_comment);
        Statement stmt_merchant = con_merchant.createStatement();
        Statement stmt_comment = con_comment.createStatement();


        double comment_sort_score=0;

        //杨梅红  90。666分
           double distance = 5338;
        //   String id="10";
        //贝乐   78。116分
         //  double distance =1414;
        //   String id="1";
        //美院少年 72。754

        //double distance =0;
       //贝勒
        // String id="1";
        //杨梅红
        String id="6";
        //吸光 36。64
        //String comment_id="473";//13.476069621483216
        //String comment_id="474";//12.545623953935618
        String comment_id="442";
        String comment_score=null;
        String hot_score=null;
        String comment_quantity=null;
        String ins_time=null;
        double E,C,R,Q;


        String sql_query = "SELECT * FROM `merchant` where id ="+id;
        double result= 1-distance*0.1/500;
        if (result<0){
            result = 0;
        }
        ResultSet ret = stmt_merchant.executeQuery(sql_query);
        //D最终结果
        double D = 30*result;
        while(ret.next()) {
            //平均分
            comment_score = ret.getString("comment_score");
            //排名分
            hot_score = ret.getString("hot_score");
            //评论数量
            comment_quantity = ret.getString("comment_qty");
        }
        E=Double.valueOf(comment_score);
        R=Double.valueOf(hot_score);
        C=Double.valueOf(comment_quantity);

        if (20*E>100){
            E=100;
        }else{
            E= 20*E;
        }
        if (5*C>100){
            C=100;
        }
        else{
            C=5*C;
        }
        if (R>100){
            R=100;
        }
        double total_merchnt = D+0.2*E+0.2*C+0.3*R;

        sql_query = "SELECT * from `comment` where id= "+comment_id;
        System.out.println(sql_query);

         ret = stmt_comment.executeQuery(sql_query);

        while(ret.next()) {
            //初始分
            comment_sort_score = ret.getDouble("comment_sort_score");
            //评价生成时间
            ins_time = ret.getString("ins_tm");

        }
        Q = Double.valueOf(comment_sort_score);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        //当前时间
        String now_time=df.format(new Date());
/*
        String now_time ="2020-12-01 05:59:00";
        ins_time= "2020-12-01 00:00:00";
*/

        Date date1 = df.parse(ins_time);
        Date date2 = df.parse(now_time);
        System.out.println("date1:"+date1);
        System.out.println("date2:"+date2);
        long from2 = date1.getTime();
        long to2 = date2.getTime();

        double hours = (double) ((to2 - from2) / (1000 * 60 * 60));
        int T=(int)hours/6;
      //  System.out.println("cha:"+cha);
        System.out.println("两个时间之间的小时差为：" + hours);
        System.out.println("T:"+T);
        System.out.println("Q:"+Q);
        System.out.println("total_merchant:"+total_merchnt);

        double G=1.8;

        double S=(0.4*total_merchnt+0.6*Q)/pow((T+1),1.8);
        System.out.printf("pow:"+String.valueOf(pow((T+1),1.8)));
        System.out.println("comment_sort_score:"+comment_sort_score);

        System.out.println("S:"+S);



        // S=(0.4*total_merchnt+0.6*Q)/(T+1)G

        dbclose.doClose(con_merchant);
        dbclose.doClose(con_comment);

    }
}
