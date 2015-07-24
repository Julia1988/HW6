package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {
	
  @Test
  public void testNonEmptyContactCreation() throws Exception {    
    GroupContact contact = new GroupContact();
    	contact.firstname = "a";
		contact.lastname = "";
		contact.address = "Address";
		contact.home = "Home";
		contact.mobile = "Mobile";
		contact.work = "Work";
		contact.email1 = "E-mail:";
		contact.email2 = "E-mail:";
		contact.day = "1";
		contact.month = "January";
		contact.year = "2015";
		contact.secondaryaddress = "Secondary Address";
		contact.secondaryhome = "Secondary Home";
		
		app.getNavigationHelper().openMainPage();
		
		List<GroupContact> oldList = app.getContactHelper().getContacts();
		
		app.getNavigationHelper().gotoContactPage();
		app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(contact);    
        app.getContactHelper().submitContactCreation();    
        app.getContactHelper().returnToHomePage();
        
        List<GroupContact> newList = app.getContactHelper(). getContacts();
        
        assertEquals(newList.size(), oldList.size()+1);
        
        oldList.add(contact);
        Collections.sort(oldList);
        assertEquals(newList, oldList);
        
      }
     

  @Test
  public void testEmptyContactCreation() throws Exception {
	  
	app.getNavigationHelper().openMainPage();
	
	List<GroupContact> oldList = app.getContactHelper().getContacts();
	
	GroupContact contact = new GroupContact("", "", "", "", "", "", "", "", "-", "-", "", "", "");
	app.getNavigationHelper().gotoContactPage();
	app.getContactHelper().initContactCreation();
   	app.getContactHelper().fillContactForm(contact);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
    
    List<GroupContact> newList = app.getContactHelper(). getContacts();
    
    oldList.add(contact);
    Collections.sort(oldList);
    assertEquals(newList, oldList);
    
  }
}
