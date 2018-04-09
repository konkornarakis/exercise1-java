public class Monitor extends Product {
	
	private String monitorType;
	private int monitorDimension;
	private int monitorRes;
	private String monitorPorts;
	
	private long discount = 0.1;
	
	public Monitor(String model, int year, String manufacturer, double price, String monitorType, int monitorDimension, int monitorRes, String monitorPorts) {
		super(model, year, manufacturer, price);
		this.monitorType = monitorType;
		this.monitorDimension = monitorDimension;
		this.monitorRes = monitorRes;
		this.monitorPorts = monitorPorts;
	}
	
	public long getDiscount() {
		return discount;
	}
}