public class Order {

	private String clientName, clientTelNumb, dateOfOrder, orderETA, orderStatus;
	private double finalTotalCost;
	private int id;
	Product product;
	public static int orderID = 0;

	public Order(Product p, String clientName, String clientTelNumb, String dateOfOrder, String orderETA,
			double finalTotalCost, String orderStatus) {
		this.id = giveOrderID();
		this.clientName = clientName;
		this.clientTelNumb = clientTelNumb;
		this.dateOfOrder = dateOfOrder;
		this.orderETA = orderETA;
		this.finalTotalCost = finalTotalCost;
		this.orderStatus = orderStatus;
		this.product = p;
	}

	public Product getProduct() {
		return this.product;
	}

	public static int giveOrderID() {
		++orderID;
		return orderID;
	}

	public int getOrderID() {
		return id;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getClientName() {
		return clientName;
	}

	public String getClientTelNub() {
		return clientTelNumb;
	}

	public String getDateOfOrder() {
		return dateOfOrder;
	}

	public String getOrderETA() {
		return orderETA;
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

	public void setDateOFSale(String dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

	public void setOrderETA(String orderETA) {
		this.orderETA = orderETA;
	}

	public void setFinalTotalCost(double finalTotalCost) {
		this.finalTotalCost = finalTotalCost;
	}

	public String toString() {
		return "Order ID: " + this.id + ". Client's name: " + this.clientName + ". Client's tel. numb.: "
				+ this.clientTelNumb + ". Date of order: " + this.dateOfOrder + ". Order ETA: " + this.orderETA
				+ ". Final total cost: " + this.finalTotalCost + ". Order status: " + this.orderStatus;
	}
}