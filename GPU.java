public class GPU extends Product {

	private String gpuChipset;
	private int gpuMemory;

	GPU(String model, int year, String manufacturer, double price, int stock, String gpuChipset, int gpuMemory) {
		super(model, year, manufacturer, price, stock);
		this.gpuChipset = gpuChipset;
		this.gpuMemory = gpuMemory;
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
	
}