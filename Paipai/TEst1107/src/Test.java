public class Test {
    //多态
    public static void main(String[] args){
        Master m=new Master();

        Cat c=new Cat();
        m.feed(c);
        Dog d=new Dog();
        m.feed(d);

    }
}
