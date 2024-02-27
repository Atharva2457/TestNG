package TestNG.Axis;

import org.testng.annotations.Test;

public class DependsOnMethodeg {
	@Test
	public void testcase1eg()
	{
		System.out.println("Test 1 is successful");
	}
	
	@Test(dependsOnMethods = "testcase1eg")
	public void testcase2eg()
	{
		System.out.println("Test 2 is successful");
	}
	
	@Test(dependsOnMethods = "testcase2eg")
	public void testcase3eg()
	{
		System.out.println("Test 3 is successful");
	}

	
}
