package generics.smart_warehouse_management_system;

abstract class WarehouseItem{
	protected String name;
	protected String id;
	public WarehouseItem(String name, String id) {
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public abstract double getVolume();
}
