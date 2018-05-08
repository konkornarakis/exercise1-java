public class Mobo extends Product {

	private String cpuType;
	private int memory;
	private int ports;

	public Mobo(String model, int year, String manufacturer, double price, int stock, String cpuType, int memory, int ports) {
		super(model, year, manufacturer, price, stock);
		this.cpuType = cpuType;
		this.memory = memory;
		this.ports = ports;
	}

	public String getCpuType() {
		return cpuType;
	}

	public int getMemory() {
		return memory;
	}

	public int getPorts() {
		return ports;
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
	
	public String toString() {
		return super.toString() + " CPU Type: " + getCpuType() + ". Memory: " + getMemory() + ". Ports: " + getPorts()
				+ ".";
	}
}