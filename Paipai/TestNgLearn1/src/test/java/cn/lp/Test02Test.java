package cn.lp;
import junit.framework.TestCase;
import org.testng.annotations.*;

@Test(groups="Monday1")
public class Test02Test extends TestCase {

    @BeforeMethod(enabled =false)
    public void setUp() throws Exception {
        System.out.println("Test is ready!");
    }
    @AfterClass(enabled =false)
    public void tearDown() throws Exception {
        System.out.println("Test is finish!");
    }
    @Test(enabled =false)
    public void testSum() {
        System.out.println("Testing...");
    }
}

