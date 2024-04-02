package zoo.model.visitor;

public abstract class Child extends Visitor {
  protected int age;
  
	protected Child(int age) {
		this.age = age;
	}
	
	@Override
	public String whoAmI() {
		return super.whoAmI() + " I'm a child.";
	}
}
