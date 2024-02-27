package TestNG.Axis;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = {"Sanity","Regression"})
public void login() {
		System.out.println("User is logged in");
	}
	
	@Test(groups = {"Regression"})
	public void AddTocart() {
			System.out.println("Added to cart");
		}
	@Test(groups = {"Sanity"})
	public void Products() {
			System.out.println("products displayed");
		}
	@Test(groups = {"Regression"})
	public void Payment() {
			System.out.println("Payment done");
		}
	
	
	
}
