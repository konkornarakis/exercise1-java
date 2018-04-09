public class RAM extends Product {
	
	private String ramType;
	private int ramCapacity;
	private int ramFrequency;
	
	private long discount = 0.25;
	
	public RAM(String model, int year, String manufacturer, int price, String ramType, int ramCapacity, int ramFrequency) {
		super(model, year, manufacturer, price);
		this.ramType = ramType;
		this.ramCapacity = ramCapacity;
		this.ramFrequency = ramFrequency;
	}
	
	public long getDiscount() {
		return discount;
	}
}