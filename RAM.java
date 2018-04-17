public class RAM extends Product {

	private String ramType;
	private int ramCapacity;
	private int ramFrequency;
	private int stock = 2;
	private double DISCOUNT = 0.25;

	public RAM(String model, int year, String manufacturer, double price, String ramType, int ramCapacity,
			int ramFrequency) {
		super(model, year, manufacturer, price);
		this.ramType = ramType;
		this.ramCapacity = ramCapacity;
		this.ramFrequency = ramFrequency;
		this.stock = stock;
	}

	public double getDiscount() {
		return DISCOUNT;
	}

	public int getStock() {
		return stock;
	}

	public String getRamType() {
		return ramType;
	}

	public int getRamCapacity() {
		return ramCapacity;
	}

	public double getRamFrequency() {
		return ramFrequency;
	}

	public void setRamType(String ramType) {
		this.ramType = ramType;
	}

	public void setRamCapacity(int ramCapacity) {
		this.ramCapacity = ramCapacity;
	}

	public void setRamType(int ramFrequency) {
		this.ramFrequency = ramFrequency;
	}

	public void updateStock() {
		this.stock -= 1;
	}
}