package JDBCTest01;

public class Test {
    public static void main(String[] args) {
        /*
        * 杨梅红   95.87928-10
        * 贝乐    80.13115-1
        * 美院    75.12111-7
        * 巧尔    72.75206-2
        * 小智    56.66678-52
        * 浙徽    53.796875-4
        * 聚光    53.373028-29
        * 吸光    52.563583-30
        *
        * */
        double yangmeihong=95.87928;//null
        double beile=80.13115;//null
        double meiyuanshaonian=75.12111;//main5
        double qiaoer=72.75206;//null
        double jugang=53.373028;//null


        double xiaozhi=56.66678;//null
        double zhehui=53.796875;//2
        double xiguang=52.563583;//5,4


        System.out.println("杨梅红："+yangmeihong);
        System.out.println("贝乐"+beile);
        System.out.println("巧儿："+qiaoer);
        System.out.println("小智==："+xiaozhi);
        System.out.println("浙徽==："+zhehui*1.2);
        System.out.println("聚光中心==："+jugang);
     //   System.out.println("聚光中心*1.2："+jugang*1.2);
        System.out.println("吸光中心："+xiguang);
        System.out.println("吸光中心*1.2："+xiguang*1.2);
        System.out.println("美院少年：=="+meiyuanshaonian);
    }
}
