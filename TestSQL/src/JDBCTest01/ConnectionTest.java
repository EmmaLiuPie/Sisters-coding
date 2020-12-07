package JDBCTest01;//导入包
import JDBCTest01.util.DataBaseClose;
import JDBCTest01.util.DataBaseConnection;

import java.sql.Connection;
import java.sql.SQLException;

/*
 * 数据库连接
 */
public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        //连接数据库
        Connection con = null;
        DataBaseConnection dbconnection = new DataBaseConnection();
        DataBaseClose dbclose = new DataBaseClose();
        con = dbconnection.doConnction(con);
/*
        //查询
        Statement stmt = con.createStatement();
        String sql;
        sql = "SELECT * FROM `merchant` ";
        ResultSet ret = stmt.executeQuery(sql);
        while(ret.next()){
            String name = ret.getString("name");
            String address = ret.getString("address");
            System.out.println("name:"+name);
            System.out.println("address:"+address);
        }
*/


        //插入企业
        CreatCompany cc  = new CreatCompany();
        con = cc.doCreatCompany(con);
        //关闭数据库
        dbclose.doClose(con);




    }
}