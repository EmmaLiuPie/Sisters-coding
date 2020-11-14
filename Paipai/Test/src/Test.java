public class Test {
    //主方法
    public static void main(String[] args) {
        //要求在这里编写程序，调用method1
        //使用完整方式调用
        Test.method1();
        //使用省略方式调用
        method1();

        //要求在这里编写程序，调用method2
        Test t1=new Test();
        //使用完整方式调用
        t1.method2();
        //使用省略方式调用
        //无
    }

    //带有static的方法
    public static void method1(){
        //调用doSome()
        //完整方式调用
        Test.doSome();
        //省略方式调用
        doSome();

        //调用doOther()
        Test t2=new Test();
        //完整方式调用
        t2.doOther();
        //省略方式调用
        //无


        //访问i
        //完整方式调用
        System.out.println(t2.i);
        //省略方式调用

    }
    //没有带有static的方法
    public void method2(){
        //调用doSome()
        //完整方式调用
        Test.doSome();
        //省略方式调用
        doSome();

        //调用doOther()
        //完整方式调用
        this.doOther();
        //省略方式调用
        doOther();


        //访问i
        //完整方式调用
        Test t3=new Test();
        System.out.println(t3.i);

        //省略方式调用
        System.out.println(i);
    }
    //没有static的变量
    int i=10;
    //带有static的方法
    public static void doSome(){
        System.out.println("doSome");

        }
        //没有static的方法
    public void doOther(){
        System.out.println("doSome");

    }


}
