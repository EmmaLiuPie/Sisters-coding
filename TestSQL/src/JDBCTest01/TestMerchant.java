package JDBCTest01;

import JDBCTest01.util.DataBaseClose;
import JDBCTest01.util.DataBaseConnection_merchant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestMerchant {
    public static void main(String[] args) throws SQLException {

        Connection con = null;
        DataBaseConnection_merchant dbconnection = new DataBaseConnection_merchant();
        DataBaseClose dbclose = new DataBaseClose();
        con = dbconnection.doConnction(con);
        Statement stmt = con.createStatement();

       //杨梅红  95。866分
        double distance = 2250;
        String id="24";

        //贝乐   78。116分
     //   double distance =1414;
     //   String id="1";

        //美院少年 72。754
        //   double distance =1141;
         //  String id="2";
        String comment_score=null;
        String hot_score=null;
        String comment_quantity=null;
        double E,C,R;

        String sql_query = "SELECT * FROM `merchant` where id ="+id;

        double result= 1-distance*0.1/500;
        if (result<0){
            result = 0;
        }
        ResultSet ret = stmt.executeQuery(sql_query);
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
        System.out.println("E:"+comment_score);
        System.out.println("R:"+hot_score);
        System.out.println("C:"+comment_quantity);
        System.out.println("------");
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
        System.out.println("D:" + D);
        System.out.println("E:" + E);
        System.out.println("R:" + R);
        System.out.println("C:" + C);

        double total = D+0.2*E+0.2*C+0.3*R;
        System.out.println("finally score:"+total);

        dbclose.doClose(con);

    }
}
