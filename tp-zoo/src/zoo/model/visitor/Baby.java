package zoo.model.visitor;

import zoo.model.Noisy;

public class Baby extends Child implements Noisy {
	public Baby() {
		super(0);
	}
	
	@Override
	public String whoAmI() {
	    return super.whoAmI() + " I'm less than 1 year old : I'm a baby !";
	}
  
	@Override
	public Integer priceOfTicket() {
		return 0;
	}
	
	public String noise() {
		return "waaaaaaaaa";
	}
}
