package zoo.model.visitor;

public class SchoolAge extends Child {
	public SchoolAge(int age) {
		super(age);
	}

	@Override
	public String whoAmI() {
		return super.whoAmI() + " I'm between 6 and 12 years old : I'm a school-age child!";
	}

	@Override
	public Integer priceOfTicket() {
		return REGULAR_TICKET / 3;
	}
}
