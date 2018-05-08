public class Keyboard extends Product {

	private String keyboardConn;

	public Keyboard(String model, int year, String manufacturer, double price, int stock, String keyboardConn) {
		super(model, year, manufacturer, price, stock);
		this.keyboardConn = keyboardConn;
	}

	public String getKeyboardConn() {
		return keyboardConn;
	}

	public void setKeyboardConn(String keyboardConn) {
		this.keyboardConn = keyboardConn;
	}

}
