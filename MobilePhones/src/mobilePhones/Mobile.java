package mobilePhones;

import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="mobileBean")
@SessionScoped
public class Mobile {
	
	private String brand;
	private String type;
	private String color;
	private int amount;
	private int price;
	
	public Mobile() {	
	}
	
	public Mobile(String brand, String type, String color, int amount, int price) {
		super();
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.amount = amount;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	private static ArrayList<Mobile> mobiles = new ArrayList<Mobile>(
		Arrays.asList(
			new Mobile("Nokia", "N123", "fekete", 55, 90000),
			new Mobile("Nokia", "T123", "fehér", 45, 80000),
			new Mobile("HTC", "H123", "piros", 35, 70000),
			new Mobile("LG", "P123", "fekete", 15, 40000),
			new Mobile("Ericson", "R123", "fekete", 25, 125000),
			new Mobile("LG", "E123", "fekete", 3, 50000)
		)
	);
	
	public ArrayList<Mobile> getMobiles(){
		return mobiles;
	}
}
