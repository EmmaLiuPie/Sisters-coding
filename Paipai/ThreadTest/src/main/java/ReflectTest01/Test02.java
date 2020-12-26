package ReflectTest01;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c1 = Class.forName("ReflectTest01.bean.User");
        Object cc = c1.newInstance();
        System.out.println(cc);
    }
}
