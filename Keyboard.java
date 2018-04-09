public class Keyboard extends Product {
	
	private String keyboardConn;
	
	private double discount = 0.1;
	
	public Keyboard(String model, int year, String manufacturer, double price, String keyboardConn) {
		super(model, year, manufacturer, price);
		this.keyboardConn = keyboardConn;
	}
	
	public double getDiscount() {
		return discount;
	}
}