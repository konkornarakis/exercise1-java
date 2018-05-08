public class Mouse extends Product {

	private String mouseTech;
	private String mouseConn;

	public Mouse(String model, int year, String manufacturer, double price, int stock, String mouseTech, String mouseConn) {
		super(model, year, manufacturer, price, stock);
		this.mouseTech = mouseTech;
		this.mouseConn = mouseConn;
	}

	public String getMouseTech() {
		return mouseTech;
	}

	public String getMouseConn() {
		return mouseConn;
	}

	public void setMouseTech(String mouseTech) {
		this.mouseTech = mouseTech;
	}

	public void setMouseConn(String mouseConn) {
		this.mouseConn = mouseConn;
	}
}