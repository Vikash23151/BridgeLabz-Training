package address_book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	private String addressBookName;
	public AddressBook(String addressBookName) {
		this.addressBookName=addressBookName;
	}
	
	public String getName() {
		return addressBookName;
	}
	
	public void setName(String newAddressBookName) {
		addressBookName=newAddressBookName;
	}
	
	Scanner sc=new Scanner(System.in);
	ArrayList<Contact> addressBook=new ArrayList<>();
	
	public void addContact() {
		System.out.print("Enter the first name: ");
		String firstName=sc.nextLine();
		System.out.print("Enter the last name: ");
		String lastName=sc.nextLine();
		System.out.print("Enter the address: ");
		String address=sc.nextLine();
		System.out.print("Enter the city: ");
		String city=sc.nextLine();
		System.out.print("Enter the state: ");
		String state=sc.nextLine();
		System.out.print("Enter the zip: ");
		String zip=sc.nextLine();
		System.out.print("Enter the phoneNumber: ");
		String phoneNumber=sc.nextLine();
		System.out.print("Enter the email: ");
		String email=sc.nextLine();
			
		addressBook.add(new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email));
	}
	public void editByName(String fullName) {
		boolean found=false;
		for(Contact c:addressBook) {
			if(c.getName().equalsIgnoreCase(fullName)) {
				
				System.out.print("Enter the first name: ");
				String firstName=sc.nextLine();
				c.setFirstName(firstName);
				
				System.out.print("Enter the last name: ");
				String lastName=sc.nextLine();
				c.setLastName(lastName);
				
				System.out.print("Enter the address: ");
				String address=sc.nextLine();
				c.setAddress(address);
				
				System.out.print("Enter the city: ");
				String city=sc.nextLine();
				c.setCity(city);
				
				System.out.print("Enter the state: ");
				String state=sc.nextLine();
				c.setState(state);
				
				System.out.print("Enter the zip: ");
				String zip=sc.nextLine();
				c.setZip(zip);
				
				System.out.print("Enter the phoneNumber: ");
				String phoneNumber=sc.nextLine();
				c.setPhoneNumber(phoneNumber);
				
				System.out.print("Enter the email: ");
				String email=sc.nextLine();
				c.setEmail(email);
				
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Name not found !");
		}
	}
	public void deleteByName(String fullName) {
		boolean found=false;
		for(int i=0;i<addressBook.size();i++) {
			if(addressBook.get(i).getName().equalsIgnoreCase(fullName)) {
				addressBook.remove(i);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Name not found !");
		}
	}
	
	public void displayContactDetails() {
		for(Contact c: addressBook) {
			System.out.println("Details of Contact named "+c.getName()+" :");
			c.displayDetails();
			System.out.println("====================");
		}
	}
	
}
