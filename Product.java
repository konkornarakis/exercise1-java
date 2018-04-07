public class Product {
	
	private String model;
	private int year;
	private String manufacturer;
	private int price;
	
	public item(String model, int year, String manufacturer, int price) {
		this.model = model;
		this.year = year;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setModel(String nModel) {
		this.model = nModel;
	}
	
	public void setYear(int nYear) {
		this.year = year;
	}
	
	public void setManufacturer(String nManufacturer) {
		this.manufacturer = nManufacturer;
	}
	
	public void setPrice(int nPrice) {
		this.price = nPrice;
	}
}