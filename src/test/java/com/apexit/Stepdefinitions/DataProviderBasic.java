package com.apexit.Stepdefinitions;

	 
	import org.testng.annotations.DataProvider;
	
	
	import org.testng.annotations.Test;
	public class DataProviderBasic {
	    
	     
	     
	    // You must need to mention data provider method name in Test method
	    @Test(dataProvider="DataContainer")
	    public void studentRegistration(String First_name, String Last_Name, String Email_ID) {
	        System.out.println("Registered student with details: "+First_name+" "+Last_Name+" "+Email_ID);
	         
	       
	    }
	      
	     
	    // A data provider method with return type as 2D array
	    @DataProvider(name="DataContainer")
	    public Object[] myDataProvider() {
	         
	        Object data[][]=  new Object[5][3];
	        // First student details
	        data[0][0]= "Mukesh"; 
	        data[0][1]= "Otwani";
	        data[0][2]= "Motwani@gmail.com";
	         
	        // Second student details
	        data[1][0]= "Amod";
	        data[1][1]= "Mahajan";
	        data[1][2]= "amahajan@hotmail.com";
	         
	        // Third student details
	        data[2][0]= "Animesh";
	        data[2][1]= "Prashant";
	        data[2][2]= "aprashant@gmail.com";
	         
	        // Fourth student details
	        data[3][0]= "Ankur";
	        data[3][1]= "Singh";
	        data[3][2]= "asingh@gmail.com";
	         
	        // Fifth student details
	        data[4][0]= "Amritansh";
	        data[4][1]= "Kumar";
	        data[4][2]= "akumar@gmail.com";
	         
	        return data;
	         
	         
	    }
	}

