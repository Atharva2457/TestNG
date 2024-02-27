package TestNG.Axis;

import org.testng.annotations.Test;

public class PriorityTesting {
	@Test(priority = 2)
	public void testcase1eg()
	{
		System.out.println("Test 1 is successful");
	}
	
	@Test(priority = 0)
	public void testcase2eg()
	{
		System.out.println("Test 2 is successful");
	}
	
	@Test(priority = 1)
	public void testcase3eg()
	{
		System.out.println("Test 3 is successful");
	}

}
