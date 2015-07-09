import static org.junit.Assert.*;

import org.junit.Test;


public class BusyLampTest {

	BusyLamp busy=new BusyLamp();
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		
		assertEquals("off",busy.getState());
	}

}
