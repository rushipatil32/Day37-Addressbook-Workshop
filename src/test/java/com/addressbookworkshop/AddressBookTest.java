package com.addressbookworkshop;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

	public class AddressBookTest {
		@Test
		public void givenContactCheckifItIsCorrect() {
			try {
				Contact contacts = new Contact("Rushi", "Patil", "Wadibhokar", "Dhule", "Maharshtra", 424002,
						"7028585487", "rushipatil32@gmail.com");
				AddressBook addressBook = new AddressBook();
				addressBook.addContact(contacts);
				List<Contact> contactList = addressBook.getcontactList();
				Assert.assertTrue(contactList.contains(contacts));
				System.out.println(contactList);
			} catch (Exception e) {
				System.out.println("Issue In Adding Contacts");
			}

		}

}