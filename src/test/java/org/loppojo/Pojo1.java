package org.loppojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pojo1 extends BaseClass {

	public Pojo1() {
		PageFactory.initElements(driver, this);

	}
	@FindAll({
		
		@FindBy(xpath="//input[@name='username']"),
		@FindBy(xpath="//input[@type='text']"),
		@FindBy(xpath="(//div[@class='-MzZI'])[1]")
	})
	private WebElement txtuser;

	@FindBys({
		
		@FindBy(xpath="//input[@name='password']"),
		
		@FindBy(xpath="//input[@type='password']")
	})
	
	private WebElement txtpass;
	
	
	@FindAll({
		
		@FindBy(xpath="(//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    '])[1]"),
		
		@FindBy(xpath="//button[@class='sqdOP  L3NKy   y3zKF     ']"),
		@FindBy(xpath="//div[text()='Log In']")
	})
	
	private WebElement loginbtn;


	public WebElement getTxtuser() {
		return txtuser;
	}


	public WebElement getTxtpass() {
		return txtpass;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}



}
