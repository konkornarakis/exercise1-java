public class Disk extends Product {
	
	private String diskType;
	private double diskDimensions;
	private int diskCapacity;
	
	private double discount = 0.25;
	
	public Disk(String model, int year, String manufacturer, double price, String diskType, double diskDimensions, int diskCapacity) {
		super(model, year, manufacturer, price);
		this.diskType = diskType;
		this.diskDimensions = diskDimensions;
		this.diskCapacity = diskCapacity;
	}
	
	public double getDiscount() {
		return discount;
	}
}