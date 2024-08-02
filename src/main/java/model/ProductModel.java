/*package model;


import java.io.Serializable;


public class ProductModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String productName;
	private String productDesc;
	private Double price;
	private Integer quantity;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public ProductModel(String productName, String productDesc, double price, int quantity) {
		this.productName= productName;
		this.productDesc= productDesc;
		this.price= price;
		this.quantity= quantity;
		
		
		
		
	}
	
	
}*/


package model;

public class ProductModel {
	private String productId;
    private String productName;
    private String productDesc;
    private double price;
    private int quantity;

    public ProductModel(String productId, String productName, String productDesc, double price, int quantity) {
    	this.productId= productId;
        this.productName = productName;
        this.productDesc = productDesc;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
}

	