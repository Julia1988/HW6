package com.example.tests;

public class GroupContact implements Comparable<GroupContact>{
	
	public String firstname;
	public String lastname;
	public String address;
	public String home;
	public String mobile;
	public String work;
	public String email1;
	public String email2;
	public String day;
	public String month;
	public String year;
	public String secondaryaddress;
	public String secondaryhome;

	public GroupContact() {
	}
	public GroupContact(String firstname, String lastname, String address, String home, String mobile, String work,
			String email1, String email2, String day, String month, String year, String secondaryaddress,
			String secondaryhome) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.home = home;
		this.mobile = mobile;
		this.work = work;
		this.email1 = email1;
		this.email2 = email2;
		this.day = day;
		this.month = month;
		this.year = year;
		this.secondaryaddress = secondaryaddress;
		this.secondaryhome = secondaryhome;
	}
	
	@Override
	public String toString() {
		return "GroupContact [firstname=" + firstname + "]";
	}
	
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((home == null) ? 0 : home.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroupContact other = (GroupContact) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		return true;
	}

	@Override
	public int compareTo(GroupContact other) {
		return this.firstname.toLowerCase().compareTo(other.firstname.toLowerCase());
		
	}
	
		
}