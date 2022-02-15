package model;

import interfaces.IDrink;

public class Soda extends Drink{
	public Soda() {
		super();
	}
	public Soda(Float price,String name) {
		super(price,name);
	}
	@Override
	public Float getPrice() {
		// TODO Auto-generated method stub
		return this.price*1.10f;
	}


	
}
