package oopIntor;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		
		
		Product product6 = new Product( 1,"Leaovo V14 ",15000 ,"16 Gb RAM ");
		
		Product product1 = new Product();
		product1.id = 1 ;
		product1.name = "Lanovo V14 ";
		product1.unitPrice = 3900;
		product1. dataail = "16 GB Ram ";

		Product product2 = new Product();
		product2.id = 2 ;
		product2.name = "Lanovo V14";
		product2.unitPrice = 5100;
		product2. dataail = "64 GB Ram ";
		

		Product product3 = new Product();
		product3.id = 3 ;
		product3.name = "HP 4 ";
		product3.unitPrice = 2800;
		product3. dataail = "12 GB Ram ";
		
		
		
		
		Product[] products = {product1,product2,product3};
		for (Product product : products ) {
			System.out.println(product.name);

		}
		
		System.out.println(products.length);
		
		Category category1 = new  Category() ;
		category1.id= 1 ;
		category1.name = "Bilgisayar";
		 
		Category category2 = new Category();
		category2.id = 2 ;
		category2.name= "EV/Bahçe";
		
		ProductManager productManager = new ProductManager() ;
		
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
		
		
		
	}

}
