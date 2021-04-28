package oopIntor;



public class Product {
	
	
	private int id ;
	private  String name ;
	private double unitPrice;
	private String dataail ;
	private double dincount ;

	 
	 
		public Product () {
			
		}
		
	 
	
	
	public Product(int id, String name, double unitPrice, String dataail, double dincount ) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.dataail = dataail;
		this.dincount = dincount ;
		
		
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getUnitPrice() {
		return unitPrice;
	}




	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}




	public String getDataail() {
		return dataail;
	}




	public void setDataail(String dataail) {
		this.dataail = dataail;
	}




	public double getDincount() {
		return dincount;
	}




	public void setDincount(double dincount) {
		this.dincount = dincount;
	}




	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.dincount );
	}



	
		
}
	
	


