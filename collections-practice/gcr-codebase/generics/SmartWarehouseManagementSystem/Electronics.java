package generics.smart_warehouse_management_system;

class Electronics extends WarehouseItem {
	double length,width,height;
	public Electronics(String name, String id, String dimensions) {
		super(name,id);
		String[] d=dimensions.split("x");
		this.length=Double.parseDouble(d[0]);
		this.width=Double.parseDouble(d[1]);
		this.height=Double.parseDouble(d[2]);
	}
	public double getVolume() {
		return length*width*height;
	}
}
