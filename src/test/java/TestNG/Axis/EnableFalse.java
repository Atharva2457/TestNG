package TestNG.Axis;

import org.testng.annotations.Test;

public class EnableFalse {
	@Test(enabled = false)
	public void testcase1eg()
	{
		System.out.println("Test 1 is successful");
	}
	
	@Test
	public void testcase2eg()
	{
		System.out.println("Test 2 is successful");
	}
	
	@Test
	public void testcase3eg()
	{
		System.out.println("Test 3 is successful");
	}

}
