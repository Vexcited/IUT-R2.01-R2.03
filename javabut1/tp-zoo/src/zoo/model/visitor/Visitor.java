package zoo.model.visitor;

public abstract class Visitor {
    protected static final int REGULAR_TICKET = 10;
  
    public String sayHello() {
	      return "Hello! I'm a visitor." + this.whoAmI();
    }
  
	public String whoAmI() {
		return "";
	}
	
	public Integer priceOfTicket() {
		return REGULAR_TICKET;
	}
}
