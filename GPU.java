public class GPU extends Product {
	
	private String gpuChipset;
	private int gpuMemory;
	
	private long discount = 0.25;
	
	GPU(String model, int year, String manufacturer, int price, String gpuChipset, int gpuMemory) {
		super(model, year, manufacturer, price);
		this.gpuChipset = gpuChipset;
		this.gpuMemory = gpuMemory;
	}
	
	public long getDiscount() {
		return discount;
	}
}