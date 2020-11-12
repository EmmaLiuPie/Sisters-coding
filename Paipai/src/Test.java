public class Test {
    public static void main(String[] args) {
        Menu m=new ChineseCooker();
        Customer cc=new Customer(m);
        cc.cook();
    }
}
