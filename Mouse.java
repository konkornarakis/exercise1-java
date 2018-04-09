public class Mouse extends Product {
	
	private String mouseTech;
	private String mouseConn;
	
	private long discount = 0.1;
	
	public Mouse(String model, int year, String manufacturer, int price, String mouseTech, String mouseConn) {
		super(model, year, manufacturer, price);
		this.mouseTech = mouseTech;
		this.mouseConn = mouseConn;
	}
	
	public long getDiscount() {
		return discount;
	}
}