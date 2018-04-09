public class Sale {
	
	private String saleID, productSold, clientName, clientTelNum, dateOfSale;
	private double finalTotalCost;
	
	public Sale(String saleID, String productSold, String clientName, String clientTelNumb, String dateOfSale, double finalTotalCost) {
		this.saleID = saleID;
		this.productSold = productSold;
		this.clientName = clientName;
		this.clientTelNum = clientTelNumb;
		this.dateOfSale = dateOfSale;
		this.finalTotalCost = finalTotalCost;
	}
}