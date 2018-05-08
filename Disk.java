public class Disk extends Product {
	
	private String diskType;
	private double diskDimensions;
	private int diskCapacity;
	
	public Disk(String model, int year, String manufacturer, double price, int stock, String diskType, double diskDimensions, int diskCapacity) {
		super(model, year, manufacturer, price, stock);
		this.diskType = diskType;
		this.diskDimensions = diskDimensions;
		this.diskCapacity = diskCapacity;
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
	
}