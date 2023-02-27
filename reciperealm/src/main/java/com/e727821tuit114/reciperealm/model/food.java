package com.e727821tuit114.reciperealm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class food {
	
	@Id
	private int id;
	private String name;
	private String foodname;
	private int quantity;
	
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
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public food(int id, String name, String foodname, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.foodname = foodname;
		this.quantity = quantity;
	}
	
	public food() {
		
	}
	
	@Override
	public String toString() {
		return "food [id=" + id + ", name=" + name + ", foodname=" + foodname + ", quantity=" + quantity + "]";
	}
	
	

}