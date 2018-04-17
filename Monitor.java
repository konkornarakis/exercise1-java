public class Monitor extends Product {
	
	private String monitorType;
	private double monitorDimension;
	private int monitorRes;
	private String monitorPorts;
	private int stock = 2;
	private final double DISCOUNT = 0.1;
	
	public Monitor(String model, int year, String manufacturer, double price, String monitorType, double monitorDimension, int monitorRes, String monitorPorts) {
		super(model, year, manufacturer, price);
		this.monitorType = monitorType;
		this.monitorDimension = monitorDimension;
		this.monitorRes = monitorRes;
		this.monitorPorts = monitorPorts;
		this.stock = stock;
	}
	
	public double getDiscount() {
		return DISCOUNT;
	}
	
	public int getStock() {
		return stock;
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
	
	public void updateStock() {
		stock -= 1;
	}
}