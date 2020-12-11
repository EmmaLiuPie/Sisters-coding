package JDBCTest01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class CreatCompany {
    public Connection doCreatCompany(Connection con) throws SQLException {

        Statement stmt = con.createStatement();

        String sql_insertCompany;
        String sql_query,sql_delete;
        String sql_insertFirstpart;
        String sql_insertSecondpart;
        String company_id=null;
        String companyName=null;
        String firstpart_id = null;
        String secondpat_id = null;
        String flow_id =null;
        String sql_insertContract;
        Random random = new Random(1000);//指定种子数字
        int i = random.nextInt(10000);
        //在company表中删除该企业数据
        sql_delete = "DELETE FROM `company` WHERE `name` = 'lp测试企业001'";
        //在company表中插入企业数据
        String social_code = "27623WF"+Integer.toString(i);
        sql_insertCompany="\n" +
                "INSERT INTO `company` (`name`,`type`,`legal_person`,`social_code`,`license_url`,`latest_auth_status`,`latest_contract_staus`,`latest_contract_id`,`latest_contract_type`,`ins_tm`,`upd_tm`,`invalid`) " +
                "VALUES ('lp测试企业002',1,'王志杰','"+social_code+"','https://assets.haoduo.vip/hd-mercury/dev/upload//1607408435724_b68f8b6658b385a1f7ffb47875c300ad.jpg',3,3,694,2,'2020-12-08 14:20:57','2020-12-08 14:28:15',0);";

        sql_query = "SELECT * FROM `company` WHERE `name` = 'lp测试企业001'";
        System.out.println(sql_insertCompany);

        //stmt.execute(sql_delete);
        stmt.execute(sql_insertCompany);
        //查询出插入企业的id，供以后使用
        ResultSet ret_insertCompany = stmt.executeQuery(sql_query);
        while(ret_insertCompany.next()) {
            company_id = ret_insertCompany.getString("id");
            social_code = ret_insertCompany.getString("social_code");
            companyName = ret_insertCompany.getString("name");
            System.out.println("企业id:" + company_id);
        }


        //填入fisrstpart
        sql_delete = "DELETE FROM `first_party` WHERE `mail` = \"lintest@haoduo.vip\"";
        sql_insertFirstpart ="INSERT INTO `first_party` (`user_id`,`name`,`address`,`mail`,`phone`,`qq`,`wx`,`ins_tm`,`upd_tm`) VALUES (51,'刘派','甲方联系人地址','lintest@haoduo.vip','18888188888',null,null,'2020-12-08 14:24:23','2020-12-08 14:24:23');";

        //stmt.execute(sql_delete);
        stmt.execute(sql_insertFirstpart);
        sql_query ="SELECT * FROM `first_party` WHERE `mail` = \"lintest@haoduo.vip\"";
        ResultSet ret_insertFirstPart =stmt.executeQuery(sql_query);
        while(ret_insertFirstPart.next()) {
            firstpart_id = ret_insertFirstPart.getString("id");
            System.out.println("firstpary id:" + firstpart_id);
        }
        //填入secondpart
        sql_delete = "delete from second_party where flow_id=\"15540000232323622\"";
        sql_insertSecondpart = "INSERT INTO `second_party` (`extend`,`status`,`flow_id`,`account_id`,`org_id`,`third_party_userId_seq`,`ins_tm`,`upd_tm`,`company_id`,`auth_url`) VALUES\n" +
                "('{\"companyName\":\""+companyName+"\",\"companyAddress\":\"乙方住所所在地\",\"signerName\":\"刘派\",\"signerPhone\":\"17098041189\",\"businessLicenseUrl\":\"https://assets.haoduo.vip/hd-mercury/dev/upload//1607408435724_b68f8b6658b385a1f7ffb47875c300ad.jpg\",\"socialCode\":\""+social_code+"\",\"legalPerson\":\"王志杰\",\"legalPersonIdNumber\":\"120102194411228370\",\"accountName\":\"\",\"account\":\"\",\"depositBank\":\"\",\"contactName\":\"刘派\",\"contactPhone\":\"17098041189\",\"contactAddress\":\"联系人地址\",\"contactEmail\":\"liupai@163.com\",\"contactWx\":null,\"contactQq\":null,\"legalPersonIdNumberPictureUrl1\":\"\",\"legalPersonIdNumberPictureUrl2\":\"\"}',3,'15540000232323622','302402e96223407ca49083b933e84070','4ecdad8e4696409e8a6f898c158ad6b3','611_1','2020-12-08 14:21:11','2020-12-08 14:26:41',71,'');\n";

        //stmt.execute(sql_delete);
        stmt.execute(sql_insertSecondpart);
        sql_query = "select * from second_party where flow_id=\"15540000232323622\"";
        ResultSet ret_insertScondPart = stmt.executeQuery(sql_query);
        while(ret_insertScondPart.next()) {
            secondpat_id = ret_insertScondPart.getString("id");
            flow_id = ret_insertScondPart.getNString("flow_id");
            System.out.println("secondpart id:" + secondpat_id);
        }

        //插入contract数据
        sql_delete = "delete FROM `contract` WHERE `company_id` = \""+company_id+"\"";
        sql_insertContract = "INSERT INTO `contract` (`company_id`,`merchant_id`,`first_party_id`,`second_party_id`,`flow_id`,`file_id`,`template_id`,`status`,`url`,`type`,`extend`,`enable`,`ins_tm`,`upd_tm`,`first`) VALUES\n" +
                " ("+company_id+",null,"+firstpart_id+","+secondpat_id+","+flow_id+",'99640ebc81014fcb871c94e91c8e3077','681d8a8eb39049719d30c2201adae707',3,'https://haoduo-merchant.oss-cn-hangzhou.aliyuncs.com/default/contract/company/71/contract_694_4799787716fa4e249956bb2f882aba2d.pdf',2,'{\"offline\":{\"basicFactor\":12,\"derateFactor\":2.22,\"actualFactor\":9.78},\"online\":{\"basicFactor\":12,\"derateFactor\":1.11,\"actualFactor\":10.89}}',1,'2020-12-08 14:21:11','2020-12-08 15:01:45',1);";
        sql_query = "select * FROM `contract` WHERE `company_id` = \""+company_id+"\"";
        stmt.execute(sql_delete);
        stmt.execute(sql_insertContract);
        ResultSet ret_insertContract = stmt.executeQuery(sql_query);
        while(ret_insertContract.next()) {
            String contract_id = ret_insertContract.getString("id");
            System.out.println("contract id :"+contract_id);
        }
        return con;

    }
}
