package generics.smart_warehouse_management_system;

import java.util.ArrayList;

class Storage<T extends WarehouseItem>{
	ArrayList<T> items;
	public Storage() {
		items=new ArrayList<>();
	}
	public void addItem(T item) {
		items.add(item);
	}
	public T getItem(int idx) {
		return items.get(idx);
	}
	public int size() {
		return items.size();
	}
	public void displayAllItems(ArrayList<? extends WarehouseItem> anyStorage) {
		for(WarehouseItem item:anyStorage) {
			System.out.println("ID: " + item.getId() + 
                               ", Name: " + item.getName() + 
                               ", Volume: " + item.getVolume());
		}	
	}
}
