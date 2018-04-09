public class Mobo extends Product {
	
	private String cpuType;
	private int memory;
	private int ports;
	
	private double discount = 0.25F;
	
	public Mobo(String model, int year, String manufacturer, double price, String cpuType, int memory, int ports) {
		super(model, year, manufacturer, price);
		this.cpuType = cpuType;
		this.memory = memory;
		this.ports = ports;
	}
	
	public String getCpuType() {
		return this.cpuType;
	}
	
	public int getMemory() {
		return this.memory;
	}
	
	public int getPorts() {
		return this.ports;
	}
	
	public void setCpuType(String nCpuType) {
		this.cpuType = nCpuType;
	}
	
	public void setMemory(int nMemory) {
		this.memory = nMemory;
	}

	public void setPorts(int nPorts) {
		this.ports = nPorts;
	}
	
	public double getDiscount() {
		return discount;
	}
}