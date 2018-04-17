public class CPU extends Product {

	private double ghz;
	private int cores;
	private boolean obg; // on board graphics
	private int stock = 2;
	private double DISCOUNT = 0.25;

	public CPU(String model, int year, String manufacturer, double price, double ghz, int cores, boolean obg) {
		super(model, year, manufacturer, price);
		this.ghz = ghz;
		this.cores = cores;
		this.obg = obg;
		this.stock = stock;
	}

	public double getDiscount() {
		return DISCOUNT;
	}

	public int getStock() {
		return stock;
	}

	public double getGHz() {
		return ghz;
	}

	public int getCores() {
		return cores;
	}

	public boolean getObg() {
		return obg;
	}

	public void setGHz(double ghz) {
		this.ghz = ghz;
	}

	public void setCores(int cores) {
		this.cores = cores;
	}

	public void setObg(boolean obg) {
		this.obg = obg;
	}

	public void updateStock() {
		this.stock -= 1;
	}
}