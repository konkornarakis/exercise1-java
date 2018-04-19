public class Product {

	private String model;
	private int year;
	private String manufacturer;
	private double price;

	public Product(String model, int year, String manufacturer, double price) {
		this.model = model;
		this.year = year;
		this.manufacturer = manufacturer;
		this.price = price;
		//this.stock = stock;
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

	public double getPrice() {
		return this.price;
	}

	public int getStock() {
		return this.getStock();
	}

	public double getDiscount() {
		return this.getDiscount();
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	public void setManufacturer(String nManufacturer) {
		this.manufacturer = nManufacturer;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "Model: " + getModel() + ". Year: " + getYear() + ". Manufacturer: " + getManufacturer() + ". Price: "
				+ getPrice() + ".";
	}

	public void updateStock() {
		this.updateStock();
	}
	
	//This method checks if 2 products are matching. 2 products are matching if they have the same model name, year, manufacturer, price
	@Override
	public boolean equals(Object other) {
		if (other instanceof Product) {
			Product otherProduct = (Product) other;
			return (otherProduct.getModel().equals(this.getModel()) &&  otherProduct.getYear()==this.getYear() && otherProduct.getManufacturer().equals(this.getManufacturer()) && otherProduct.getPrice() == this.getPrice());
		}

		return false;
	}
}
