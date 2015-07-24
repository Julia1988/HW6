package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase{
	
	
  @Test(dataProvider = "randomValidGroupGenerator")
  public void testGroupCreationWithValidData(GroupData group) throws Exception {
	  
	app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().gotoGroupPage();
    
    List<GroupData> oldList = app.getGroupHelper().getGroups();
    
       
    app.getGroupHelper().initGroupCreation();
   	app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupsPage();

    List<GroupData> newList = app.getGroupHelper(). getGroups();
 
     
    oldList.add(group);
    Collections.sort(oldList);
    assertEquals(newList, oldList);
    
  }

 }
