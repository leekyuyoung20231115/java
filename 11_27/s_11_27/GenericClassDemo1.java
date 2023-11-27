package s_11_27;

import s_11_27.obj.Cup;

public class GenericClassDemo1 {

	public static void main(String[] args) {
		Cup c = new Cup();		
		c.setBeverage(new Bear());
		Bear b1 = null;
		if(c.getBeverage() instanceof Bear) {
			b1 =  (Bear) c.getBeverage();
		}
		
		
		c.setBeverage(new Boricha());
		if(c.getBeverage() instanceof Bear) {
			b1 =  (Bear) c.getBeverage();
		}
		
	}

}
