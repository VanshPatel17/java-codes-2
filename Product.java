l?spackage com.code;

public class Product  implements Comparable<Product>{
	private  String prdId;
	private String  pname;
	private double price;
	private Category category;
	public Product(String prdId, String pname, double price, Category category) {
		super();
		this.prdId = prdId;
		this.pname = pname;
		this.price = price;
		this.category = category;
	}
	public String getPrdId() {
		return prdId;
	}
	public void setPrdId(String prdId) {
		this.prdId = prdId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", pname=" + pname + ", price=" + price + ", category=" + category + "]";
	}
	@Override
	public int compareTo(Product o) {
	 
		return this.prdId.compareTo(o.prdId);
	}
	
	
	

}
