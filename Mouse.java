public class Mouse extends Product {

	private String mouseTech;
	private String mouseConn;
	private int stock = 2;
	private final double DISCOUNT = 0.1;

	public Mouse(String model, int year, String manufacturer, double price, String mouseTech, String mouseConn) {
		super(model, year, manufacturer, price);
		this.mouseTech = mouseTech;
		this.mouseConn = mouseConn;
		this.stock = stock;
	}

	public double getDiscount() {
		return DISCOUNT;
	}

	public int getStock() {
		return stock;
	}

	public String getMouseTech() {
		return mouseTech;
	}

	public String getMouseConn() {
		return mouseConn;
	}

	public void setMouseTech(String mouseTech) {
		mouseTech = mouseTech;
	}

	public void setMouseConn(String mouseConn) {
		mouseConn = mouseConn;
	}

	/*
	 * public void setStock(int newStock) { this.stock = newStock; }
	 */

	public void updateStock() {
		stock -= 1;
	}
}