package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.GroupContact;

public class ContactHelper extends HelperBase {
	
	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}
	
	
	public void initContactCreation() {
			click(By.linkText("add new"));
	}
	
	public void fillContactForm(GroupContact contact) {
		type(By.name("firstname"), contact.firstname);
		type(By.name("lastname"), contact.lastname);
		type(By.name("address"), contact.address);
		type(By.name("home"), contact.home);
		type(By.name("mobile"), contact.mobile);
		type(By.name("work"), contact.work);
		type(By.name("email"), contact.email1);
		type(By.name("email2"), contact.email2);
		selectByText(By.name("bday"), contact.day);
		selectByText(By.name("bmonth"), contact.month);
		//selectByText(By.name("new_group"), "group name 1");
		type(By.name("byear"), contact.year);
		type(By.name("address2"), contact.secondaryaddress);
		type(By.name("phone2"), contact.secondaryhome);
		   
	}
	
	public void submitContactCreation() {
		click(By.name("submit"));
	
	}
	
	public void returnToHomePage() {
				click(By.linkText("home page"));
		  
	}
	
	public void deleteContact(int index) {
		selectContactByIndex (index);
		click(By.xpath("//form[2]/input[2]"));

   }

    private void selectContactByIndex(int index) {
	click(By.xpath("//form[2]/table/tbody/tr["+ (index+1) +" + 1]/td[7]/a/img"));
	

   }

   public void initContactModification(int index) {
	selectContactByIndex (index);
	click(By.xpath("//form[1]/input[11]"));
	
   }
   
   public List<GroupContact> getContacts() {
		List<GroupContact> contacts = new ArrayList<GroupContact>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox : checkboxes) {
			GroupContact contact = new GroupContact();
			
			String title = checkbox. getAttribute("title");
			contact.firstname = title.substring ("Select (".length(), title.length() - " )".length());
			// contact.firstname = title.substring ("Select (".length(), title.length() - "null)".length());
            contacts.add(contact);
			
	}  
		
		return contacts;
   }
}


