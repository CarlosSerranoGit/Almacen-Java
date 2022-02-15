package model;

import interfaces.IDrink;

public class Alcoholic extends Drink{
	
	
	public Alcoholic() {
		super();
	}
	public Alcoholic(Float price, String name) {
		super(price,name);
	}
	@Override
	public Float getPrice() {
		// TODO Auto-generated method stub
		return this.price*1.20f;
	}
	


}

