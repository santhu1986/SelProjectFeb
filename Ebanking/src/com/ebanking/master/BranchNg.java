package com.ebanking.master;

import org.testng.annotations.Test;

public class BranchNg extends Base
{
    @Test
	public void Branch() throws InterruptedException 
	{
	LB.BranchCreation("SrnagarMQ","Miyapur","45454","INDIA","GOA","GOA");	
	}
}
