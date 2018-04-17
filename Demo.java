import java.util.*;

public class Demo {

	public static boolean checkAvailability(ArrayList<Product> stock, Product product) {
		for (Product p : stock) {
			if (p.equals(product)) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] arguements) {

		System.out.println("Starting...");
		ArrayList<Product> stock = new ArrayList<Product>();
		ArrayList<Order> orders = new ArrayList<Order>();
		ArrayList<Sale> sales = new ArrayList<Sale>();

		// Creating objects for stock ArrayList
		Product mobo1 = new Mobo("ZQ-11", 2017, "Asus", 100.0, "AMD", 16, 8);
		Product mobo2 = new Mobo("X299-A", 2017, "Asus", 271.0, "Intel", 32, 8);
		
		Product cpu1 = new CPU("ryzen", 2016, "AMD", 132.0, 3, 4, false);
		Product cpu2 = new CPU("ryzen", 2017, "AMD", 82.39, 3.6, 4, false);

		Product ram1 = new RAM("dd", 2015, "Kingston", 13.0, "DDR4", 4, 2666);
		Product ram2 = new RAM("LPX", 2016, "Corsair", 81.0, "DDR4", 8, 2400);

		Product gpu1 = new GPU("GTX 1060", 2017, "Palet", 678.0, "nVidia", 6);
		Product gpu2 = new GPU("GTX 1080", 2016, "MSI", 673.0, "nVidia", 8);

		Product disk1 = new Disk("PPP", 2016, "SAMSUNG", 50.0, "SSD", 2.5, 256);
		Product disk2 = new Disk("NAS", 2016, "Western Digital", 115.0, "HDD", 3.5, 4000);

		Product monitor1 = new Monitor("FLATRON E1900", 2015, "LG", 110.0, "LCD", 22, 1080, "DVI");
		Product monitor2 = new Monitor("Dell SE2717H", 2016, "Dell", 188.0, "LCD", 27, 1080, "HDMI");

		Product keyboard1 = new Keyboard("ORNATA", 2017, "Razer", 120.0, "Wired");
		Product keyboard2 = new Keyboard("CK108", 2017, "Motospeed", 49.0, "Wired");

		Product mouse1 = new Mouse("Deathader", 2017, "Razer", 65.8, "Optical", "Wired");
		Product mouse2 = new Mouse("M185", 2016, "Logitech", 12.0, ";azer", "Wired");

		Product printer1 = new Printer("PIXMA C1370", 2016, "Canon", 180.0, "Inkjet", "Coloured");
		Product printer2 = new Printer("Xpress M2026", 2015, "Samsung", 47.0, "Inkjet", "Coloured");

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

		Scanner sc = new Scanner(System.in);
		String[] comp = { "Motherboard", "CPU", "GPU", "RAM", "Disk" };
		String[] per = { "Monitor", "Keyboard", "Mouse", "Printer" };
		String[] categ2 = { "Components", "Peripherals" };
		String[] categ = { "View availability", "View orders", "Exit" };
		int j, select, select2, select3, select4, select5;
		// j : counter for printing ordered lists
		String date = "20/4/2018", ETA = "24/42018"; // date and order Estimated Time of Arrival are fixed
		boolean done = false;

		while (!done) {
			// Printing Categories
			for (int i = 1; i < categ.length + 1; i++) {
				System.out.println(i + ". " + categ[i - 1]);
			}
			System.out.print("> ");
			
			//input: select => View availability, View orders or Exit?
			do {
				select = sc.nextInt(); // View availability, View orders or Exit
				if (select != 1 && select != 2 && select != 3) {
					System.out.println("Invalid selection - Try again");
					System.out.print("> ");
				}
			} while (select != 1 && select != 2 && select != 3);

			// ============================= VIEW AVAILABILITY =====================================
			if (select == 1) { 

				//System.out.println("You entered: View availability");

				for (int i = 1; i < categ2.length + 1; i++) { // Printing kind
																// of Products
					System.out.println(i + ". " + categ2[i - 1]);
				};
				System.out.print("> ");
				
				//input select2 => Components or Peripherals?
				do {
					select2 = sc.nextInt(); // Components or Peripherals
					if (select2 != 1 && select2 != 2) {
						System.out.println("Invalid selection - Try again");
						System.out.print("> ");
					}
				} while (select2 != 1 && select2 != 2);
				
				select3 = 0; // Initializing with a random number

				if (select2 == 1) { // Entering Component's section

					System.out.println("You entered section: Components");
					
					// Printing products in components section
					for (int i = 1; i < comp.length + 1; i++) {
						System.out.println(i + ". " + comp[i - 1]);
					};
					
					System.out.print("> ");
					
					// input: select3 => Which product?
					do {
						select3 = sc.nextInt();
						if (select3 != 1 && select3 != 2 && select3 != 3 && select3 != 4 && select3 != 5) {
							System.out.println("Invalid selection - Try again");
							System.out.print("> ");
						}
					} while (select3 != 1 && select3 != 2 && select3 != 3 && select3 != 4 && select3 != 5);

					j = 1;
					
					
					if (select3 == 1) { // Printing all Motherboard products
						for (Product p : stock) {
							if (p instanceof Mobo) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							}
							
						}
						
					} else if (select3 == 2) { // Printing all CPU products
						for (Product p : stock) {
							if (p instanceof CPU) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							}
							
						}
						
					} else if (select3 == 3) { // Printing all GPU products
						for (Product p : stock) {
							if (p instanceof GPU) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							}
							
						}
						
					} else if (select3 == 4) { // Printing all RAM products
						for (Product p : stock) {
							if (p instanceof RAM) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							}
							
						}
						
					} else if (select3 == 5) { // Printing all Disk products
						for (Product p : stock) {
							if (p instanceof Disk) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							}
							
						}
						
					} 

				} else if (select2 == 2) { // Entering Peripherals' section

					System.out.println("You entered: Peripherals");
					for (int i = 1; i < per.length + 1; i++) {
						System.out.println(i + ". " + per[i - 1]);
					};
					
					System.out.print("> ");
					
					//input: select3 => Which Component product?
					do {
						select3 = sc.nextInt(); // Peripheral product
						if (select3 != 1 && select3 != 2 && select3 != 3 && select3 != 4) {
							System.out.println("Invalid selection - Try again");
							System.out.print("> ");
						}
					} while (select3 != 1 && select3 != 2 && select3 != 3 && select3 != 4);
					j = 1;

					if (select3 == 1) {
						for (Product p : stock) {
							if (p instanceof Monitor) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							}
							
						}
						
					} else if (select3 == 2) {
						for (Product p : stock) {
							if (p instanceof Keyboard) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							}
							
						}
						
					} else if (select3 == 3) {
						for (Product p : stock) {
							if (p instanceof Mouse) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							}
							
						}
						
					} else if (select3 == 4) {
						for (Product p : stock) {
							if (p instanceof Printer) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							}
							
						}
						
					}
					
				}
				
				System.out.print("> ");
				// User inputs number of product
				select4 = sc.nextInt();
				// Creating a copy of product
				Product obj = null;
				j = 0;
				
				// Determining which specific product the user has selected
				for (Product p : stock) {
					if (select2 == 1) {
						if (select3 == 1 && p instanceof Mobo) {
							j += 1;
						} else if (select3 == 2 && p instanceof CPU) {
							j += 1;	
						} else if (select3 == 3 && p instanceof GPU) {
							j += 1;
						} else if (select3 == 4 && p instanceof RAM) {
							j += 1;	
						} else if (select3 == 5 && p instanceof Disk) {
							j += 1;
						}
					} else if (select2 == 2) {	
						if (select3 == 1 && p instanceof Monitor) {
							j += 1;
						} else if (select3 == 2 && p instanceof Keyboard) {
							j += 1;
						} else if (select3 == 3 && p instanceof Mouse) {
							j += 1;
						} else if (select3 == 4 && p instanceof Printer) {
							j += 1;
						}
					}
					if (select4 == j) {
						obj = p;
						break;
					}
				}		
				
				// Printing specifications of the product that the user has
				// selected
				System.out.println(obj.toString());
				String name, telNumb;

				if (checkAvailability(stock, obj) && obj.getStock() > 0) { //Check if product is included in stock and if there are more than 0 of it in stock
					System.out.println("Product is available.");
					System.out.println("1. Buy it \n2. Exit");
					System.out.print("> ");
					//
					do {
						select5 = sc.nextInt();
						if (select5 != 1 && select5 != 2) {
							System.out.println("Invalid selection - Try again");
							System.out.print("> ");
						}
					} while (select5 != 1 && select5 != 2);
					if (select5 == 1) {
						System.out.println("Give name, telephone numb.");
						System.out.print("> ");
						name = sc.nextLine();
						name = sc.nextLine();
						System.out.print("> ");
						telNumb = sc.nextLine();
						Sale sale = new Sale(obj, name, telNumb, date, obj.getPrice() - obj.getPrice() * obj.getDiscount());
						sales.add(sale);
						obj.updateStock();
						System.out.println("Purchase completed.");
					}
					
				} else {
					System.out.println("Product is not available");
					System.out.println("1. Order it \n2. Exit");
					System.out.print("> ");
					
					//input: select5 =>  Order or Exit?
					do {
						select5 = sc.nextInt();
						if (select5 != 1 && select5 != 2) {
							System.out.println("Invalid selection - Try again");
							System.out.print("> ");
						}
					} while (select5 != 1 && select5 != 2);
					
					if (select5 == 1) {
						System.out.println("Give name, telephone numb.");
						System.out.print("> ");
						name = sc.nextLine();
						name = sc.nextLine();
						System.out.print("> ");
						telNumb = sc.nextLine();
						Order order = new Order(obj, name, telNumb, date, ETA, obj.getPrice() - obj.getPrice() * obj.getDiscount(), "Pending");
						orders.add(order);
						System.out.println("Order completed.");
					}	
				}
				
				// ============================= VIEW ORDERS =====================================
			} else if (select == 2 && !orders.isEmpty()) { 
				System.out.println("You entered: View orders");
				String name, telNumb;
				for (int i = 1; i - 1 < orders.size(); i++) {
					System.out.println(i + ". Order number " + i); // Printing orders
				}
				System.out.print("> ");
				
				//input: select2 => Which order?
				do {
					select2 = sc.nextInt();
					if (select2 >= orders.size()) {
						System.out.println("Invalid selection - Try again");
						System.out.print("> ");
					}
				} while (select2 > orders.size());
				System.out.println(orders.get(select2 - 1).toString() + "\n1. Change status \n2. Purchase");
				System.out.print("> ");
				
				//input: select3 =>  Change status or Purchase?
				do {
					select3 = sc.nextInt();
					if (select3 != 1 && select3 != 2) {
						System.out.println("Invalid selection - Try again");
						System.out.print("> ");
					}
				} while (select3 != 1 && select3 != 2);
				
				if (select3 == 1 && orders.get(select2 - 1).getOrderStatus() == "Pending") { //Changing order's status (to "Completed" if "Pending")
					orders.get(select2 - 1).setOrderStatus("Completed");
					System.out.println("Order's status changed to: Completed");
				} else if (select3 == 1 && orders.get(select2 - 1).getOrderStatus() == "Completed") { //Changing order's status (to "Pending" if "Completed")
					orders.get(select2 - 1).setOrderStatus("Pending");
					System.out.println("Order's status changed to: Pending");
				} else if (select3 == 2) {
					orders.get(select2 - 1);
					System.out.println("Give name, telephone numb.");
					name = sc.nextLine();
					System.out.print("> ");
					name = sc.nextLine();
					System.out.print("> ");
					telNumb = sc.nextLine();
					Product obj;
					obj = orders.get(select2 - 1).getProduct();
					Sale sale = new Sale(obj, name, telNumb, date, obj.getPrice() - obj.getPrice() * obj.getDiscount());
					sales.add(sale);
					System.out.println("Purchase completed.");
				}
				
			} else if (select == 2 && orders.isEmpty()) { // If there are no orders, entering here
				System.out.println("No orders");
				
				// ============================= EXIT =====================================
			} else if (select == 3) { 
				done = true;
			}
		}
		System.out.println("Terminated");
	}
}
