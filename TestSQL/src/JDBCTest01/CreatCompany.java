package JDBCTest01;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatCompany {
    public Connection doCreatCompany(Connection con) throws SQLException {

        Statement stmt = con.createStatement();
        String sql1;
        sql1="INSERT INTO `company` (`name`,`type`,`legal_person`,`social_code`,`license_url`,`latest_auth_status`,`latest_contract_staus`,`latest_contract_id`,`latest_contract_type`,`ins_tm`,`upd_tm`,`invalid`) \n" +
                "VALUES ('liupai码爸科技有限公司2',1,'陈英杰','91312001','https://assets.haoduo.vip/hd-mercury/dev/upload//1607074581593_72a76a63a93767366508c870481e98ef.jpg',1,1,null,null,'2020-12-04 17:36:28','2020-12-04 17:36:28',0);\n";
        stmt.execute(sql1);
        return con;

    }
}
