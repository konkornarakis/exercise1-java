public class Printer extends Product {

	private String printerTech;
	private String printerType;

	public Printer(String model, int year, String manufacturer, double price, int stock, String printerTech, String printerType) {
		super(model, year, manufacturer, price, stock);
		this.printerTech = printerTech;
		this.printerType = printerType;
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

}