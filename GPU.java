public class GPU extends Product {
	
	private String gpuChipset;
	private int gpuMemory;
	
	private double discount = 0.25;
	
	GPU(String model, int year, String manufacturer, double price, String gpuChipset, int gpuMemory) {
		super(model, year, manufacturer, price);
		this.gpuChipset = gpuChipset;
		this.gpuMemory = gpuMemory;
	}
	
	public double getDiscount() {
		return discount;
	}
}