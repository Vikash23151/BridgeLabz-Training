package generics.smart_warehouse_management_system;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// Electronics storage (type-safe)
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("E001", "Laptop", "0.5x0.5x0.25"));
        
        // Mixed display using wildcard
        ArrayList<WarehouseItem> mixedItems = new ArrayList<>();
        mixedItems.add(new Groceries("Milk","G001", 1.0));
        mixedItems.add(new Furniture("Chair","F001", "2x4x4"));
        
        electronicsStorage.displayAllItems(mixedItems);  // Works due to wildcard
        
        Storage<Electronics> electronicsOnly = new Storage<>();
        // electronicsOnly.addItem(new Furniture("F002", "Table", 1.0)); // Compile error - type safe!
    }
}
