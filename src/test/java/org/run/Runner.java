package org.run;

import org.base.BaseClass;
import org.loppojo.Pojo1;
import org.pojo.Pojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Runner extends BaseClass {

	@BeforeClass
	private void browserLaunch() {

		launchBrowser();
		maxBrowser();
	}

	@AfterClass
	private void browserClose() {
		closebrowser();

	}

	@BeforeMethod
	public void startstime() {
		passUrl("https://en-gb.facebook.com/");

	}

	@AfterMethod
	public void endsTime() throws InterruptedException {

		Thread.sleep(3000);

	}
	@Test
	private void tc1() throws InterruptedException {

	
	String [] username= {"    ", "suresh", "147896530", "sureshsatz2000@gmail.com"};
	String [] password= {"@#$%", "dinesh", "   ", "9384646016"};
	
	Pojo p=new Pojo();
	
	for (int i = 0; i <= username.length -1; i++) {
		
		toInput(p.getTxtuser(), username[i]);
		toInput(p.getTxtpass(), password[i]);
		
		btnClick(p.getClkbtn());
		Thread.sleep(3000);
		driver.navigate().back();
		
		System.out.println(username[i]);
		System.out.println(password[i]);
		
		
	
		
	}	
	

	
	
	
	



}
}














	//@Parameters({ "username", "password" })
//@Test
//private void testCase1(String user, String pass) {
//
//	Pojo p = new Pojo();
//	toInput(p.getTxtuser(), user);
//	toInput(p.getTxtpass(), pass);
//	btnClick(p.getClkbtn());
//	printText(p.getError());
//	
//	
//	System.out.println("My Email Id is "+user);
//	System.out.println("My Password is "+pass);
//	
//	
//	
//
//}
////@Parameters({"username","password"})
////@Test
////private void proctescaseslist()	{
////	
////	String strparam1="";
////	String strparam2="";
////	strparam1="username";
////	strparam2="password";
////	Pojo p = new Pojo();
////	toInput(p.getTxtuser(), strparam1);
////	toInput(p.getTxtpass(), strparam2);
////	btnClick(p.getClkbtn());
////	printText(p.getError());
////	
////	System.out.println("My Email Id is "+strparam1);
////	System.out.println("My Password is "+strparam2);
////	
////
////}
//
//
//
//@Parameters({ "txtbox", "valuepass" })
//@Test
//private void testCase2(String txt, String value) {
//
//	Pojo p1 = new Pojo();
//	toInput(p1.getTxtuser(), txt);
//	toInput(p1.getTxtpass(), value);
//	btnClick(p1.getClkbtn());
//	printText(p1.getError());
//	
//	System.out.println("My Mobile Number is "+txt);
//	System.out.println("My Password is"+value);	
//}
//
//@Parameters({ "editbox", "filedpass" })
//@Test
//private void testCase3(String edit, String filed) {
//
//	Pojo p2 = new Pojo();
//	toInput(p2.getTxtuser(), edit);
//	toInput(p2.getTxtpass(), filed);
//	btnClick(p2.getClkbtn());
//
//	printText(p2.getError());
//	
//	System.out.println("My Mobile Number  is "+edit);
//	System.out.println("My Password is"+filed);
//	
//}
//
//@Parameters({ "emailid", "mobileno" })
//@Test
//private void testCase4(String email, String no) {
//
//	Pojo p3 = new Pojo();
//	toInput(p3.getTxtuser(), email);
//	toInput(p3.getTxtpass(), no);
//	btnClick(p3.getClkbtn());
//
//	
//	
//	System.out.println("My Email Id is"+email);
//	System.out.println(""+no);
//	
//
//
//
//}