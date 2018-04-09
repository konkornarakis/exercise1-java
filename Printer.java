public class Printer extends Product {
	
	private String printerTech;
	private String printerType;
	
	private double discount = 0.1;
	
	public Printer(String model, int year, String manufacturer, double price, String printerTech, String printerType) {
		super(model, year, manufacturer, price);
		this. printerTech = printerTech;
		this.printerType = printerType;
	}
	
	public double getDiscount() {
		return discount;
	}
}