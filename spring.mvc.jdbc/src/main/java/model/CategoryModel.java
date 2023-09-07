package model;

public class CategoryModel {
	private int CategoryID;
	private String CategoryName;
	private String Icon;
	//Constructor
	public CategoryModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoryModel(int categoryID, String categoryName, String icon) {
		super();
		CategoryID = categoryID;
		CategoryName = categoryName;
		Icon = icon;
	}
	//Getter and Setter
	public int getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public String getIcon() {
		return Icon;
	}
	public void setIcon(String icon) {
		Icon = icon;
	}
	//To String
	@Override
	public String toString() {
		return "CategoryModel [CategoryID=" + CategoryID + ", CategoryName=" + CategoryName + ", Icon=" + Icon + "]";
	}
	
}
