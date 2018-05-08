public class Product {

	private String model;
	private int year;
	private String manufacturer;
	private double price;
	private int stock;

	public Product(String model, int year, String manufacturer, double price, int stock) {
		this.model = model;
		this.year = year;
		this.manufacturer = manufacturer;
		this.price = price;
		this.stock = stock;
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
		return this.stock;
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

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Model: " + getModel() + ". Year: " + getYear() + ". Manufacturer: " + getManufacturer() + ". Price: "
				+ getPrice() + ".";
	}

	public void updateStock() {
		this.setStock(this.getStock()-1);
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
