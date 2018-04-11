import java.util.*;

public class Demo {
	
	public static boolean checkAvailability(ArrayList<Product> stock, Product product) {
	boolean found = false;
	for(Product p: stock) {
		if(p instanceof Mobo && (product.getModel() == p.getModel())) {
			found = true;
			break;
		};
		if(p instanceof CPU && (product.getModel() == p.getModel())) {
			found = true;
			break;
		};
		if(p instanceof GPU && (product.getModel() == p.getModel())) {
			found = true;
			break;
		};
		if(p instanceof RAM && (product.getModel() == p.getModel())) {
			found = true;
			break;
		};
		if(p instanceof Monitor && (product.getModel() == p.getModel())) {
			found = true;
			break;
		};
		if(p instanceof Keyboard && (product.getModel() == p.getModel())) {
			found = true;
			break;
		};
		if(p instanceof Mouse && (product.getModel() == p.getModel())) {
			found = true;
			break;
		};
		if(p instanceof Printer && (product.getModel() == p.getModel())) {
			found = true;
			break;
		};
	};
	return found;
}
	
	public static void main(String[] arguements) {
		System.out.println("Starting...");
		ArrayList<Product> stock = new ArrayList<Product>();
		ArrayList<Order> orders = new ArrayList<Order>();
		ArrayList<Sale> sales = new ArrayList<Sale>();
		
		//Creating objects for stock ArrayList
		Product mobo1 = new Mobo("ZQ-11", 2017, "Asus", 67.0, "AMD", 16, 8);
		Product mobo2 = new Mobo("X299-A", 2017, "Asus", 271.0, "Intel", 32, 8);
		
		Product cpu1 = new CPU("ryzen", 2016, "AMD", 132.0, 3, 4 , false);
		Product cpu2 = new CPU("ryzen", 2017, "AMD", 82.39, 3.6, 4, false);
		
		Product ram1 = new RAM("dd", 2015, "Kingston", 13.0, "DDR4", 4, 2666);
		Product ram2 = new RAM("LPX", 2016, "Corsair", 81.0, "DDR4", 8, 2400);
		
		Product gpu1 = new GPU("GTX 1060", 2017, "Palet", 678.0, "nVidia", 6);
		Product gpu2 = new GPU("GTX 1080", 2016, "MSI", 673.0, "nVidia", 8);
		
		Product disk1 = new Disk("PPP", 2016, "SAMSUNG", 50.0, "SSD", 2.5, 256);
		Product disk2 = new Disk("NAS", 2016, "Western Digital", 115.0, "HDD", 3.5, 4000);
		
		Product monitor1 = new Monitor("FLATRON E1900", 2015, "LG", 110.0, "LCD", 22, 1080, "DVI");
		Product monitor2 = new Monitor("Dell SE2717H", 2016, "Dell", 188.0, "LCD", 27, 1080, "HDMI");
		
		Product keyboard1 = new Keyboard("ORNATA", 2017, "Razer", 120.0, "wired");
		Product keyboard2 = new Keyboard("CK108", 2017, "Motospeed", 49.0, "wired");
		
		Product mouse1 = new Mouse("Deathader", 2017, "Razer", 65.8, "optical", "wired");
		Product mouse2 = new Mouse("M185", 2016, "Logitech", 12.0, "lazer", "wired");
		
		Product printer1 = new Printer("PIXMA C1370", 2016, "Canon", 180.0, "inkjet", "coloured");
		Product printer2 = new Printer("Xpress M2026", 2015, "Samsung", 47.0, "inkjet", "coloured");
		
		stock.add(mobo1);
		stock.add(mobo2);
		stock.add(cpu1);
		stock.add(cpu2);
		stock.add(ram1);
		stock.add(ram2);
		stock.add(gpu1);
		stock.add(gpu2);
		stock.add(disk1);
		stock.add(disk2);
		stock.add(monitor1);
		stock.add(monitor2);
		stock.add(keyboard1);
		stock.add(keyboard2);
		stock.add(mouse1);
		stock.add(mouse2);
		stock.add(printer1);
		stock.add(printer2);
		
		boolean done = false, found = false;
		Scanner sc = new Scanner(System.in);
		int selection;
		String input, name, telNum;
		String orderETA = "14/4/2018", date = "10/4/2018";
		
		while (!done) {
			System.out.println("1. View availability \n2. View orders \n3. Exit");
			selection = sc.nextInt();
			if (selection == 1) {
				System.out.println("You entered View availability");
				System.out.println("1. Components \n2. Peripherals");
				selection = sc.nextInt();
				
				if (selection == 1) {
					System.out.println("You entered Components");
					System.out.println("1. Motherboards \n2. Processor(CPU) \n3. Memory(RAM) \n4. Graphics Cards(GPU)");
					selection = sc.nextInt();
					
					if (selection == 1) {
						System.out.println("1. Asus ZQ-11 \n2. Asus X299-A");
						selection = sc.nextInt();
						if (selection == 1) { 
							System.out.println(mobo1.toString());
							found = checkAvailability(stock, mobo1);
							if (found) { 
								System.out.println("It is available");
								System.out.println("1. Buy it \n2. Exit");
								selection = sc.nextInt();
								if (selection == 1) {
									System.out.println("Give: Name, Tel. Num.");
									name = sc.nextLine(); //Not working if i delete this line
									name = sc.nextLine();
									System.out.println("Name - OK :"+name);
									telNum = sc.nextLine();
									System.out.println("Tel. Numb. - OK: "+telNum);
									//Sale sale1 = new Sale(mobo1, "Konstantinos Kornarakis", "123", "12.12.2018", mobo1.getPrice()-mobo1.gerPrice()*mobo1.getDiscount());
									Sale sale = new Sale(mobo1, name, telNum, date, 70.0);
									sales.add(sale);
									stock.remove(mobo1);
									System.out.println("Purchase completed.");
								};
							} else {
								System.out.println("It is not available. \n1. Order it \n2.Exit");
								selection = sc.nextInt();
								if (selection == 1) {
									System.out.println("Give: Name, Tel. Num.");
									name = sc.nextLine(); //Not working if i delete this line
									name = sc.nextLine();
									System.out.println("Name - OK :"+name);
									telNum = sc.nextLine();
									System.out.println("Tel. Numb. - OK: "+telNum);
									//Order order = new Order(mobo1, name, telNum, date, orderETA, mobo1.getPrice()-mobo1.gerPrice()*mobo1.getDiscount(), false);
									Order order = new Order(mobo1, name, telNum, date, orderETA, 110.0, "Pending"); //testing with a random value for price
									orders.add(order);
									System.out.println("Order placed");
								}
							}; //line 114
						} else if (selection == 2) {
							System.out.println(mobo2.toString());
							found = checkAvailability(stock, mobo2);
						};
					} else if (selection == 2) {
						
					} else if (selection == 3) {
						
					} else if (selection == 4) {
						
					};
				} else if (selection == 2) {
					System.out.println("You entered Peripherals");
					System.out.println("1. Monitors \n2. Keyboards \n3. Mouse \n4. Printers");
					selection = sc.nextInt();
					if (selection == 1) {
						
					} else if (selection == 2) {
						
					} else if (selection == 3) {
						 
					} else if (selection == 4) {
					
					};
					done = true;
				}
				
			} else if (selection == 2) {
				System.out.println("You entered View orders");
				for(int i = 0; i < orders.size(); i++) {
					System.out.println(i+". Order number "+i);
				}
				selection = sc.nextInt();
				int selection2 = selection;
				System.out.println("You selected numb. "+selection);
				System.out.println(orders.get(selection).toString());
				System.out.println("1. Change status \n2. Purchase");
				selection = sc.nextInt();
				if (selection == 1) {
					orders.get(selection2).setOrderStatus("Completed");
					System.out.println("Status changed to: Completed");
				} else if (selection == 2) {
					//makePurchase();
				}
			} else if (selection == 3) {
				done = true;
			};
		};
		
		System.out.println("Terminated");
	}
}