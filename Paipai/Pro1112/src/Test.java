public class Test {
    public static void main(String[] args) {
        Menu m = new ChineseCooker();
        m.chicken();

// 这种写法是不对的，不能把一个接口 像对象一样 传递使用
//        Customer cc=new Customer(m);
        Customer cc=new Customer();
        cc.cook();
    }

//    console输出内容
//    Chinese-chiken
//    customer's constructor be called
//    customer's fish-function be clicked
//    customer's cook-function be clicked ，我做饭啦
//    customer's fish-function be clicked
//
//    Process finished with exit code 0
}
