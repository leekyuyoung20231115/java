package product;

import java.sql.Date;

public class ProductVO {

	private int id;
	private String pname;
	private int stock,price;
	private Date create_dt,modify_dt;
	private String delyn;
	public ProductVO(int id, String pname, int stock, int price, Date create_dt, Date modify_dt, String delyn) {
		super();
		this.id = id;
		this.pname = pname;
		this.stock = stock;
		this.price = price;
		this.create_dt = create_dt;
		this.modify_dt = modify_dt;
		this.delyn = delyn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getCreate_dt() {
		return create_dt;
	}
	public void setCreate_dt(Date create_dt) {
		this.create_dt = create_dt;
	}
	public Date getModify_dt() {
		return modify_dt;
	}
	public void setModify_dt(Date modify_dt) {
		this.modify_dt = modify_dt;
	}
	public String getDelyn() {
		return delyn;
	}
	public void setDelyn(String delyn) {
		this.delyn = delyn;
	}
	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", pname=" + pname + ", stock=" + stock + ", price=" + price + ", create_dt="
				+ create_dt + ", modify_dt=" + modify_dt + ", delyn=" + delyn + "]";
	}
	
}
