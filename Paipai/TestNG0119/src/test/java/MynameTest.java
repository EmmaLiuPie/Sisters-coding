import org.testng.Assert;
import org.testng.annotations.Test;

public class MynameTest {

    @org.testng.annotations.BeforeMethod
    public void setUp() {
        System.out.println("beforemethod");
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() {
        System.out.println("aftermethod");
    }

    @org.testng.annotations.Test
    public void testGetName() {
        System.out.println("get name");
    }

    @org.testng.annotations.Test
    public void testSetName() {
        System.out.println("set name");
    }

    @org.testng.annotations.Test
    public void testGetAge() {
        System.out.println("get age");
    }

    @org.testng.annotations.Test
    public void testSetAge() {
        System.out.println("set age");
    }

    @Test
    public void f(){
        System.out.println("fff");
        Assert.assertTrue(true);
    }


}