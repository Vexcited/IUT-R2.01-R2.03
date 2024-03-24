package zoo.model.visitor;

public class Teenager extends Child {
	public Teenager(int age) {
		super(age);
	}

	@Override
	public String whoAmI() {
		return super.whoAmI() + " I'm between 12 and 18 years old : I'm a teenager !";
	}

	@Override
	public Integer priceOfTicket() {
		return REGULAR_TICKET / 2;
	}
}
