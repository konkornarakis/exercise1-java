public class CPU extends Product {

	private double ghz;
	private int cores;
	private boolean obg; // on board graphics

	public CPU(String model, int year, String manufacturer, double price, int stock, double ghz, int cores, boolean obg) {
		super(model, year, manufacturer, price, stock);
		this.ghz = ghz;
		this.cores = cores;
		this.obg = obg;
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

}