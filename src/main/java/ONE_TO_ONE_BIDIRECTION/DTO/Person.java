package ONE_TO_ONE_BIDIRECTION.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Person {
	@Id
	private int personId;
	private String name;
	private String address;
	@Cascade( CascadeType.ALL)
	@OneToOne
	@JoinColumn
	private Pancard pancard;

	public int getPersonId() {
		return personId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Pancard getPancard() {
		return pancard;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", address=" + address + ", pancard=" + pancard
				+ "]";
	}

}
