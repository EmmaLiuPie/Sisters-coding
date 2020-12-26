package ReflectTest01;
/*
* 3种方式，获取类名
*
* */
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("java.lang.String") ;
        Class c2 = Class.forName("java.util.Date");

        System.out.println("c1  :"+c1);
        System.out.println("c2  :"+c2);

        //Student st = new Student();
        //Class c3 = st.getClass();
        Class c3 = new Student().getClass();
        System.out.println("c3  :"+c3);
       // System.out.println(st.getClass()==c3);
        Class c4 = int.class;
        System.out.println("c4  :"+c4);

    }
}
class Student{
    int no;
    String name;
}
