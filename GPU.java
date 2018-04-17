public class GPU extends Product {

	private String gpuChipset;
	private int gpuMemory;
	private int stock = 2;
	private double DISCOUNT = 0.25;

	GPU(String model, int year, String manufacturer, double price, String gpuChipset, int gpuMemory) {
		super(model, year, manufacturer, price);
		this.gpuChipset = gpuChipset;
		this.gpuMemory = gpuMemory;
		this.stock = stock;
	}

	public double getDiscount() {
		return DISCOUNT;
	}

	public int getStock() {
		return this.stock;
	}

	public String getGpuChipset() {
		return gpuChipset;
	}

	public int getGpuMemory() {
		return gpuMemory;
	}

	public void setGpuChipset(String gpuChipset) {
		this.gpuChipset = gpuChipset;
	}

	public void setGpuMemory(int gpuMemory) {
		this.gpuMemory = gpuMemory;
	}

	public void updateStock() {
		this.stock -= 1;
	}
}