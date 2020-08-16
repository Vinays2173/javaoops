
public class SbiAmazon {
	
	public static void main(String[] args) {
		// int k variable discribe the per day data of kitchen sales;
		int k1 =12345;
		int k2 = 12346;
		int k3 = 21456;
		 // int m varibale describe the monile sales
		int m1 = 454142;
		int m2 = 451420;
		int m3 = 145236;
		System.out.println("kitchen ");
		System.out.println(" day 1  sale: "+k1);
		System.out.println(" day 2 sale: "+k2);
		System.out.println(" day 3 sale: "+k3);
		
		System.out.println(" Mobile devices ");
		System.out.println(" Day 1 sale: "+m1);
		System.out.println(" day 2 sale: "+m2 );
		System.out.println(" day 3 sale: "+m3);
		
		
		int totalkitchen = k1+k2+k3;
		System.out.println("total sales of kitchen materials in 3 days: "+totalkitchen);
		System.out.println();
		int totalmobile = m1+m2+m3;
		System.out.println("Total sales of mobile devices in 3 days is: "+totalmobile);
		System.out.println();
		if(totalkitchen > totalmobile)
			System.out.println(" SBI will put stall on kitchen materails");
		else if(totalmobile> totalkitchen)
			System.out.println(" SBI must put stall on mobile devices");
		
		double discountkitchen = 0.10 * totalkitchen;
		double discountmobile = 0.10* totalmobile;
		System.out.println("Discount on mobile devices is:"+discountmobile);
		System.out.println("Discount on kitchen materials: "+discountkitchen);
		
	}		
}
