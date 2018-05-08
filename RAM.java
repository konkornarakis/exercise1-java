public class RAM extends Product {

	private String ramType;
	private int ramCapacity;
	private int ramFrequency;

	public RAM(String model, int year, String manufacturer, double price, int stock, String ramType, int ramCapacity,
			int ramFrequency) {
		super(model, year, manufacturer, price, stock);
		this.ramType = ramType;
		this.ramCapacity = ramCapacity;
		this.ramFrequency = ramFrequency;
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

}