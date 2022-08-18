package org.run;

import java.io.IOException;

import org.base.BaseClass;
import org.loppojo.Pojo1;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner2 extends BaseClass{
	
	

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
	private void startsTime() {
		
		passUrl("https://www.instagram.com/");

	}
	
	@AfterMethod
	
	private void endsTime() throws InterruptedException {
		
		Thread.sleep(3000);

	}
	
	@Test
	 private void tc1() throws IOException, InterruptedException{
		
		String [] username= {"    ", "value", "sdrst", "ending"};
		String [] password= {"ddff", "srys", "suresh", "   "};
		
		Pojo1 p=new Pojo1();
		
		for (int i = 0; i <= username.length -1; i++) {
			
			toInput(p.getTxtuser(), username[i]);
			toInput(p.getTxtpass(), password[i]);
			
			btnClick(p.getLoginbtn());
			Thread.sleep(3000);
			driver.navigate().refresh();
			System.out.println(username[i]);
			System.out.println(password[i]);
			
			
		}
	}


}
