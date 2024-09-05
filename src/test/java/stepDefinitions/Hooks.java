package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@netbankingDB")
	public void netbankingDBsetup()
	{
		System.out.println("set up entries in netbaking database");
	}
	
	
	@After
	public void teardown()
	{
		System.out.println("clearing the cache");
	}
	
	@Before("@MortgageDB")
	public void mortgageDBsetup()
	{
		System.out.println("set up entries in Mortgage database");
	}


}
