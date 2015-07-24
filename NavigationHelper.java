package com.example.fw;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

	public NavigationHelper(ApplicationManager manager) {
		super(manager);
	}

	public void openMainPage() {

		driver.get(manager.baseUrl);
	}
	
	
	public void gotoGroupPage() {
	   click(By.linkText("groups"));
	   
	}

	public void gotoContactPage() {
		click(By.linkText("add new"));
		
	}
	
}

