package oopProduct;

public class Product {
	
	//Attribute, property leri, field
	//üye değişkenleri
	//sınıf değişkenleri
	private String productId;

	public String name;
	
	private double unitPrice;

	private int unitInStock;
	
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
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

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	
	/*
	public void bilgileriGetir() {
		System.out.println("Id: " + productId + " Price: " + unitPrice + " Unit Stock: " + unitInStock
				+ " Name: " + name);
	}
	*/

}
