public class Order {
	
		private String id, productOrdered, clientName, clientTelNumb, dateOfPurchase, orderETA;
		private double finalTotalCost;
		private boolean orderStatus;
		
		public Order(String id, String productOrdered, String clientName, String clientTelNum, String dateOfPurchase, String orderETA, double finalTotalCost, boolean orderStatus) {
			this.id = id;
			this.productOrdered = productOrdered;
			this.clientName = clientName;
			this.clientTelNumb = clientTelNum;
			this.dateOfPurchase = dateOfPurchase;
			this.orderETA = orderETA;
			this.finalTotalCost = finalTotalCost;
			this.orderStatus = orderStatus;
		}
}