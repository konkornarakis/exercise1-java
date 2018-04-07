public class Mobo {
	
	private String cpuType;
	private int memory;
	private int ports;
	
	public Mobo(String cpuType, int memory, int ports) {
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
}