import java.net.BindException;
import java.util.concurrent.Callable;

public class   Test01 {
    public static void main(String[] args){
        Animal a1=new Animal();
        a1.move();

        Cat c1=new Cat();
        c1.move();

        Animal a2=new Cat();
        a2.move();

        Eagle e1=new Eagle();
        e1.move();
        e1.catMouse();

        //如果让a2抓老鼠
         Cat c2=(Cat)a2;
         c2.catMouse();

        System.out.println(a2 instanceof Bird);

        if(a2 instanceof Bird){
            Bird b2=(Bird)a2;

        }
        else if(a2 instanceof Cat){
            Cat c3=(Cat)a2;
            c3.catMouse();
        }

    }
}
