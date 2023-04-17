package ONE_TO_ONE_BIDIRECTION.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pancard {
	@Id
	private int pancardId;
	private String name;
	private String address;
	@OneToOne( mappedBy = "pancard")
	private Person person;

	public int getPancardId() {
		return pancardId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Person getPerson() {
		return person;
	}

	public void setPancardId(int pancardId) {
		this.pancardId = pancardId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Pancard [pancardId=" + pancardId + ", name=" + name + ", address=" + address + ", person=" + person
				+ "]";
	}

}
