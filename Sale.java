public class Sale {

	private String clientName, clientTelNumb, dateOfSale;
	private double finalTotalCost;
	private int id;
	private static int saleID = 0;
	Product product;

	public Sale(Product p, String clientName, String clientTelNumb, String dateOfSale, double finalTotalCost) {
		this.id = giveSaleID();
		this.clientName = clientName;
		this.clientTelNumb = clientTelNumb;
		this.dateOfSale = dateOfSale;
		this.finalTotalCost = finalTotalCost;
		this.product = p;
	}

	public Product getProduct() {
		return this.product;
	}

	public static int giveSaleID() {
		++saleID;
		return saleID;
	}

	public int getSaleID() {
		return this.id;
	}

	public String getClientName() {
		return clientName;
	}

	public String getClientTelNub() {
		return clientTelNumb;
	}

	public String getDateOfSale() {
		return dateOfSale;
	}

	public double getFinalTotalCost() {
		return finalTotalCost;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public void setClientTelNumb(String clientTelNumb) {
		this.clientTelNumb = clientTelNumb;
	}

	public void setDateOFSale(String dateOfSale) {
		this.dateOfSale = dateOfSale;
	}

	public void setFinalTotalCost(double finalTotalCost) {
		this.finalTotalCost = finalTotalCost;
	}
}