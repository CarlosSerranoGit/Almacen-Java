package model;

import interfaces.IDrink;

public abstract class Drink implements IDrink{
	protected Float price;
	private String name;
	
	public Drink() {
		this(0f,"");
	}
	public Drink(Float price, String name) {
		this.price = price;
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		
	}

	@Override
	public void setPrice(Float price) {
		// TODO Auto-generated method stub
		this.price=price;
		
	}
	@Override
	public String toString() {
		return "Drink [price=" + price + ", name=" + name + "]";
	}
}
