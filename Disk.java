public class Disk extends Product {
	
	private String diskType;
	private double diskDimensions;
	private int diskCapacity;
	private int stock = 2;
	private final double DISCOUNT = 0.25;
	
	public Disk(String model, int year, String manufacturer, double price, String diskType, double diskDimensions, int diskCapacity) {
		super(model, year, manufacturer, price);
		this.diskType = diskType;
		this.diskDimensions = diskDimensions;
		this.diskCapacity = diskCapacity;
		this.stock = stock;
	}
	
	public double getDiscount() {
		return DISCOUNT;
	}
	
	public int getStock() {
		return stock;
	}
	
	public String getDiskType() {
		return diskType;
	}
	
	public double getDiskDimensions() {
		return diskDimensions;
	}
	
	public int getDiskCapacity() {
		return diskCapacity;
	}
	
	public void setDiskType(String diskType) {
		this.diskType = diskType;
	}
	
	public void setDiskDimensions(double diskDimensions) {
		this.diskDimensions = diskDimensions;
	}
	
	public void setDiskCapacity(int diskCapacity) {
		this.diskCapacity = diskCapacity;
	}
	
	public void updateStock() {
		stock -= 1;
	}
}