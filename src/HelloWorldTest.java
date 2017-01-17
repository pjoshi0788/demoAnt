import static org.junit.Assert.assertEquals;
public class HelloWorldTest extends junit.framework.TestCase {

    public void testNothing() {
    }
    
	public void testWillAlwaysPass(){
		assertEquals(4,4);
	}
	
    public void testWillAlwaysFail() {
        fail("An error message");
    }
    
}