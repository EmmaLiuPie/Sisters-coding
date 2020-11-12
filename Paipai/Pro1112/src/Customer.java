//Menu 是接口，不是被 赋值 =，只能被实现 implement
public class Customer implements Menu {

//    Customer(Menu m){
//        this.m=m;
//    }

//    public void cook(){
//      m.fish();
//    }

    Customer(){
        // 写你的构造方法
        System.out.println("customer's constructor be called");

        this.fish();
    }

    @Override
    public void chicken() {

    }

    @Override
    public void fish() {
        System.out.println("customer's fish-function be clicked ");

    }

    public void cook (){
        System.out.println("customer's cook-function be clicked ，我做饭啦");
        this.fish();
    }
}
