public class Keyboard extends Product {

	private String keyboardConn;
	private int stock = 2;
	private final double DISCOUNT = 0.1;

	public Keyboard(String model, int year, String manufacturer, double price, String keyboardConn) {
		super(model, year, manufacturer, price);
		this.keyboardConn = keyboardConn;
		this.stock = stock;
	}

	public double getDiscount() {
		return DISCOUNT;
	}

	public int getStock() {
		return stock;
	}

	public String getKeyboardConn() {
		return keyboardConn;
	}

	public void setKeyboardConn(String keyboardConn) {
		this.keyboardConn = keyboardConn;
	}

	public void updateStock() {
		stock -= 1;
	}
}
