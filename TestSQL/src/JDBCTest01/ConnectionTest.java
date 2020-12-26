package JDBCTest01;//导入包
import JDBCTest01.util.DataBaseClose;
import JDBCTest01.util.DataBaseConnection_merchant;

import java.sql.Connection;
import java.sql.SQLException;

/*
 * 数据库连接
 */
public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        //连接数据库
        Connection con = null;
        DataBaseConnection_merchant dbconnection = new DataBaseConnection_merchant();
        DataBaseClose dbclose = new DataBaseClose();
        con = dbconnection.doConnction(con);

        //插入企业
        CreatCompany cc  = new CreatCompany();
        con = cc.doCreatCompany(con);
        //关闭数据库
        dbclose.doClose(con);




    }
}