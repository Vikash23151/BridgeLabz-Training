package generics.smart_warehouse_management_system;

class Groceries extends WarehouseItem{
	private double weight;
	public Groceries(String name, String id, double weight) {
		super(name,id);
		this.weight=weight;
	}
	public double getVolume() {
		return weight*0.001;
	}
}