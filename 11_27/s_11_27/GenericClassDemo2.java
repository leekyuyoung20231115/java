package s_11_27;

import s_11_27.generic.Cup;

public class GenericClassDemo2 {

	public static void main(String[] args) {
		Cup<Boricha> c = new Cup<Boricha>();
		c.setBeverage(new Boricha());
		Beverage b1 =  c.getBeverage();
		
		Cup<Bear> c2 = new Cup<Bear>();
		c2.setBeverage(new Bear());
		Beverage b2 = c.getBeverage();
		
	}

}
