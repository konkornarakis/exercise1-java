public class Mouse extends Product {
	
	private String mouseTech;
	private String mouseConn;
	
	private double discount = 0.1;
	
	public Mouse(String model, int year, String manufacturer, double price, String mouseTech, String mouseConn) {
		super(model, year, manufacturer, price);
		this.mouseTech = mouseTech;
		this.mouseConn = mouseConn;
	}
	
	public double getDiscount() {
		return discount;
	}
}