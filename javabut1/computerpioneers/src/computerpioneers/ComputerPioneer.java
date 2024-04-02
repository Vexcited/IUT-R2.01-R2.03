package computerpioneers;

import java.util.Objects;

public class ComputerPioneer {
	private final String firstName;
	private final String lastName;
	private final Device device;
	
	public ComputerPioneer (String firstName, String lastName, Device device) {
		this.firstName = firstName;
        this.lastName = lastName;
        this.device = device;
	}
	
	@Override
	public String toString () {
		return firstName + " " + lastName + " is a pioneer in Computer Science";
    }
	
	public boolean worksOn (Device device) {
		return this.device.equals(device);
	}

	@Override
	public int hashCode() {
		return Objects.hash(device, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComputerPioneer other = (ComputerPioneer) obj;
		return Objects.equals(device, other.device) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}
}
