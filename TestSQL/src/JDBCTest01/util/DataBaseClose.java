package JDBCTest01.util;

import java.sql.Connection;
import java.sql.SQLException;

public class DataBaseClose {
    public DataBaseClose() {
    }
    public void doClose(Connection con) throws SQLException {
        con.close();
        System.out.println("数据库关闭成功");
    }
}
