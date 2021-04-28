package oopIntor;


public class Main {  

	public static void main(String[] args) {
		
		
		
	//	Product product6 = new Product( 1,"Leaovo V14 ",15000 ,"16 Gb RAM ");
		
		Product product1 = new Product();
		product1.setId(2);
		product1.setName("Lenovo");
		product1.setDataail("15 GB RAM");
		product1.setDincount(10);
		product1.setUnitPrice(16000);

		System.out.println(product1.getUnitPriceAfterDiscount() );
	
		
 		
		
		
	
		
		
	}

}
