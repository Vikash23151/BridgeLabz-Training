package address_book;

import java.util.ArrayList;

public class AddressBookManager {
	ArrayList<AddressBook> addressBookManager=new ArrayList<>();
	
	public void addAddressBook(String addressBookName) {
		addressBookManager.add(new AddressBook(addressBookName));
	}
	
	public AddressBook getAddressBook(String name) {
		for(AddressBook b: addressBookManager) {
			if(b.getName().equalsIgnoreCase(name)) {
				return b;
			}
		}
		return null;
	}
	public void editAddressBookName(String newName, String oldName) {
		boolean found=false;
		for(AddressBook b: addressBookManager) {
			if(b.getName().equalsIgnoreCase(oldName)) {
				b.setName(newName);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Address Book Name not found !");
		}
	}
	
	public void deleteAddressBook(String name) {
		boolean found=false;
		for(int i=0;i<addressBookManager.size();i++) {
			if(addressBookManager.get(i).getName().equalsIgnoreCase(name)) {
				addressBookManager.remove(i);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Address Book Name not found !");
		}
	}
	public void displayAddressBookDetails() {
		for(AddressBook b: addressBookManager) {
			System.out.println("Details of AddressBook named "+b.getName()+" :");
			b.displayContactDetails();
			System.out.println("++++++++++++++++++++");
		}
	}
}
