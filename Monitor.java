public class Monitor extends Product {
	
	private String monitorType;
	private double monitorDimension;
	private int monitorRes;
	private String monitorPorts;
	
	public Monitor(String model, int year, String manufacturer, double price, int stock, String monitorType, double monitorDimension, int monitorRes, String monitorPorts) {
		super(model, year, manufacturer, price, stock);
		this.monitorType = monitorType;
		this.monitorDimension = monitorDimension;
		this.monitorRes = monitorRes;
		this.monitorPorts = monitorPorts;
	}
	
	public String getMonitorType() {
		return monitorType;
	}
	
	public double getMonitorDimension() {
		return monitorDimension;
	}
	
	public int getMonitorRes() {
		return monitorRes;
	}
	
	public String getMonitorPorts() {
		return monitorPorts;
	}
	
	public void setMonitorType(String monitorType) {
		this.monitorType = monitorType;
	}
	
	public void setMonitorDimension(int monitorDimension) {
		this.monitorDimension = monitorDimension;
	}

	public void setMonitorPorts(String monitorPorts) {
		this.monitorPorts = monitorPorts;
	}

}