package com.example.fw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplicationManager {
	
	public WebDriver driver;
	public String baseUrl;
		
	public NavigationHelper navigationHelper;
	public GroupHelper groupHelper;
	public ContactHelper contactHelper;
	 
	public ApplicationManager() {
	
	    driver = new FirefoxDriver();
	    baseUrl =  "http://localhost/addressbookv4.1.4";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    navigationHelper = new NavigationHelper(this);
	    groupHelper = new GroupHelper(this);	
	    contactHelper = new ContactHelper(this);
	 }
		    
	public void stop() {
	    driver.quit();	
	}
	    
	
	public NavigationHelper getNavigationHelper() {
		if (navigationHelper == null) {
			navigationHelper = new NavigationHelper(this);
			
	}
		return navigationHelper;
		
	}	
		public GroupHelper getGroupHelper() {
			if (groupHelper == null) {
				groupHelper = new GroupHelper(this);
				
	}
			return groupHelper;
	
	}
        public ContactHelper getContactHelper() {
	if (contactHelper == null) {
		contactHelper = new ContactHelper(this);
		
    }
	      return contactHelper;
    
        }

		public String getBaseUrl() {
			return baseUrl;
		}

		public void setBaseUrl(String baseUrl) {
			this.baseUrl = baseUrl;
		}
	
	}






	
	
