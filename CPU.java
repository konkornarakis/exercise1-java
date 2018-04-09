public class CPU extends Product {
	
	private int cpuFrequency;
	private int cores;
	private boolean obg;
	
	private long discount = 0.25;
	
	public CPU(String model, int year, String manufacturer, int price, int ghz, int cores, boolean obg) {
		super(model, year, manufacturer, price);
		this.ghz = ghz;
		this.cores = cores;
		this.obg = obg;
	}
	
	public long getDiscount() {
		return discount;
	}
}