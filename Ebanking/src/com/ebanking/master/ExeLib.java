package com.ebanking.master;

import java.io.IOException;

public class ExeLib 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
      // Instance Class
		
		Library LB=new Library();
		
		String Rval=LB.OpenApp("http://103.211.39.246/ranford2");
		System.out.println(Rval);
		
		Rval=LB.AdminLgn("Admin","Mindq@Sys");
	    System.out.println(Rval);
	    
		Rval=LB.BranchCreation("Srnagarhdfcbnkhghffd","Srnagar","54554","INDIA","GOA","GOA");
		System.out.println(Rval);
		
	}

}
