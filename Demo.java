import java.util.*;

public class Demo {
	
	public static void main(String[] arguements) {
		System.out.println("Starting...");
		/*           Testing            */
		ArrayList<Product> stock = new ArrayList<Product>();
		ArrayList<Order> orders = new ArrayList<Order>();
		ArrayList<Sale> sales = new ArrayList<Sale>();
		
		//Creating objects for stock ArrayList
		Product mobo1 = new Mobo("ZQ-11", 2017, "Asus", 67.0, "testCpuType", 16, 8);
		//Product mobo2 = new Mobo();
		Product cpu1 = new CPU("ryzen", 2016, "AMD", 132.0, 3, 4 , false);
		//Product cpu2 = new CPU();
		Product ram1 = new RAM("dd", 2015, "Kingston", 13.0, "DDR4", 4, 2666);
		//Product ram2 = new RAM();
		Product gpu1 = new GPU("GTX 1060", 2017, "nVidia", 678.0, "nVidia", 6);
		//Product gpu2 = new GPU();
		Product disk1 = new Disk("PPP", 2016, "SAMSUNG", 50.0, "SSD", 2.5, 256);
		//Product disk2 = new Disk();
		Product monitor1 = new Monitor("FLATRON E1900", 2015, "LG", 110.0, "LCD", 22, 1080, "DVI");
		//Product monitor2 = new Monitor();
		Product keyboard1 = new Keyboard("ORNATA", 2017, "Razer", 120.0, "wired");
		//Product keyboard2 = new Keyboard();
		Product mouse1 = new Mouse("Deathader", 2017, "Razer", 65.8, "optical", "wired");
		//Product mouse2 = new Mouse();
		Product printer1 = new Printer("PIXMA C1370", 2016, "Canon", 180.0, "inkjet", "coloured");
		//Product printer2 = new Printer();
		
		stock.add(mobo1);
		//stock.add(mobo2);
		stock.add(cpu1);
		//stock.add(cpu2);
		stock.add(ram1);
		//stock.add(ram2);
		stock.add(gpu1);
		//stock.add(gpu2);
		stock.add(disk1);
		//stock.add(disk2);
		stock.add(monitor1);
		//stock.add(monitor2);
		stock.add(keyboard1);
		//stock.add(keyboard2);
		stock.add(mouse1);
		//stock.add(mouse2);
		stock.add(printer1);
		//stock.add(printer2);
		
		orders = null;
		sales = null;
		
		/*
		//Creating objects for orders ArrayList
		Order order1 = new Order("1A", "mobo", "Konstantinos Kornarakis", "6969696969", "9/4/2018", "13/4/2018", 70.0, false);
		Order order2 = new Order("2A", "disk", "Tasos Kastanis", "2828282828", "2/4/2018", "18/4/2018", 55.0, false);
		orders.add(order1);
		orders.add(order2);
		*/
		
		/*
		//Creating objects for sales ArrayList
		Sale sale1 = new Sale("1S", "monitor", "Konstantinos Kornarakis", "6969696969", "22/3/2018", 122.0);
		Sale sale2 = new Sale("2S", "printer", "Tasos Kastanis", "2828282828", "7/1/2018", 203.0);
		
		sales.add(sale1);
		sales.add(sale2);
		*/
		
		//
		System.out.println("Terminated");
	}
}