public class Test {
    public static void main(String[] args) {
        FoodMenu m=new ChineseCooker();
        Customer cc=new Customer(m);
        cc.cook();
    }
}
