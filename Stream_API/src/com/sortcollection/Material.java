package com.sortcollection;

public class Material implements Comparable<Material>{

	private String name;
	private String brand;
	private int price;

	public Material() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Material(String name, String brand, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Material [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Material o) {
		int price1=this.price;
		int price2=o.price;
		if (price1>price2) {
			return -1;
			
		}else if (price1<price2) {
			return 1;
			
		}else
		return 0;
	}

}
