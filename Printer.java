public class Printer extends Product {
	
	private String printerTech;
	private String printerType;
	
	private long discount = 0.1;
	
	public Printer(String model, int year, String manufacturer, int price, String printerTech, String printerType) {
		super(model, year, manufacturer, price);
		this. printerTech = printerTech;
		this.printerType = printerType;
	}
	
	public long getDiscount() {
		return discount;
	}
}