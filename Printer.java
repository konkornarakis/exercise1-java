public class Printer extends Product {

	private String printerTech;
	private String printerType;
	private int stock = 2;
	private final double DISCOUNT = 0.1;

	public Printer(String model, int year, String manufacturer, double price, String printerTech, String printerType) {
		super(model, year, manufacturer, price);
		this.printerTech = printerTech;
		this.printerType = printerType;
		this.stock = stock;
	}

	public double getDiscount() {
		return DISCOUNT;
	}

	public int getStock() {
		return this.stock;
	}

	public String getPrinterTech() {
		return printerTech;
	}

	public String getPrinterType() {
		return printerType;
	}

	public void setPrinterTech(String printerTech) {
		this.printerTech = printerTech;
	}

	public void setPrinterType(String printerType) {
		this.printerType = printerType;
	}

	/*
	 * public void setStock(int newStock) { this.stock = newStock; }
	 */

	public void updateStock() {
		this.stock -= 1;
	}
}