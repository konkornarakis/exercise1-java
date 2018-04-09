public class Disk extends Product {
	
	private String diskType;
	private int diskDimensions;
	private int diskCapacity;
	
	private long discount = 0.25;
	
	public Disk(String model, int year, String manufacturer, int price, String diskType, int diskDimensions, int diskCapacity) {
		super(model, year, manufacturer, price);
		this.diskType = diskType;
		this.diskDimensions = diskDimensions;
		this.diskCap
	}
	
	public long getDiscount() {
		return discount;
	}
}