package model;

public class ProductModel {
	private int ProductID;
	private String ProductName;
	private String Description;
	private int Price;
	private String ImageLink;
	private int CategoryID;
	private int SellerID;
	private int Amount;
	//Constructor
	public ProductModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductModel(int ProductID, String ProductName, String Description, int Price, String ImageLink,
			int CategoryID, int SellerID, int Amount) {
		super();
		this.ProductID = ProductID;
		this.ProductName = ProductName;
		this.Description = Description;
		this.Price = Price;
		this.ImageLink = ImageLink;
		this.CategoryID = CategoryID;
		this.SellerID = SellerID;
		this.Amount = Amount;
	}
	//Getter and Setter
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int ProductID) {
		this.ProductID = ProductID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String ProductName) {
		this.ProductName = ProductName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String Description) {
		this.Description = Description;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int Price) {
		this.Price = Price;
	}
	public String getImageLink() {
		return ImageLink;
	}
	public void setImageLink(String ImageLink) {
		this.ImageLink = ImageLink;
	}
	public int getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(int CategoryID) {
		this.CategoryID = CategoryID;
	}
	public int getSellerID() {
		return SellerID;
	}
	public void setSellerID(int SellerID) {
		this.SellerID = SellerID;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int Amount) {
		this.Amount = Amount;
	}
	//To String
	@Override
	public String toString() {
		return "ProductModel [ProductID=" + ProductID + ", ProductName=" + ProductName + ", Description=" + Description
				+ ", Price=" + Price + ", ImageLink=" + ImageLink + ", CategoryID=" + CategoryID + ", SellerID="
				+ SellerID + ", Amount=" + Amount + "]";
	}
	
}
