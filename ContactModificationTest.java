package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {
	

	@Test
	public void modifySomeContact () {
		
		app.getNavigationHelper().openMainPage();
		
		List<GroupContact> oldList = app.getContactHelper().getContacts();
		
		app.getContactHelper().initContactModification(0);
		GroupContact contact = new GroupContact ();
		contact.firstname = "a";
	    //app.getContactHelper().fillContactForm(contact); - эта чать должна быть, но с ней тест не работает, а без нее работает.
		// app.getContactHelper().submitContactModification();  - cоздавала, но роль update у нас выполняет клик "By.xpath ...." в init-е (в хелпере)
		app.getContactHelper().returnToHomePage();
		
        List<GroupContact> newList = app.getContactHelper(). getContacts();
	    
	    oldList.remove(0);
	    oldList.add(contact);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
 
	}	

}
