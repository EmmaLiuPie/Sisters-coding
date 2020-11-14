public class Identitytest01 {
/*
* 标识符数字字母下划线
*类名，接口名：首字母大写，后面每个单词首字母大写
* 变量名，方法名：首字母小写，后面每个单词首字母大写
* 常量名“:全部大写
* */static int a=20;
    public static void main(String args[]){
        int a=10,b=1,c=100;
        if(a==10){
            System.out.println("a=10");
        }
        else{
            System.out.println("a!=10");
        }

        switch (b){
            case 1:System.out.println("b=1");
           // break;

            case 2:System.out.println("b=2");
          //  break;
            default:
                System.out.println("b=10");


        }

    }

    /*
    * 局部变量：在方法体中声明的变量
    * 成员变量：方法体外，类体之内声明的变量，没有手动赋值的情况下，默认赋值为0
    *
    * 字符串不属于基本数据类型，属于引用数据类型
    *
    * */
}
