package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ContactRemovalTests extends TestBase {
	
	@Test
	public void deleteSomeContact () {
		
		app.getNavigationHelper().openMainPage();
		
		List<GroupContact> oldList = app.getContactHelper().getContacts();
		
	    app.getContactHelper().deleteContact(0);    
	    app.getContactHelper().returnToHomePage();
	    
	    List<GroupContact> newList = app.getContactHelper(). getContacts();
	    
	    oldList.remove(0);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	    
	   
	    
	 }
	

}
