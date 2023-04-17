package ONE_TO_ONE_BIDIRECTION.CONTROLLER;

import ONE_TO_ONE_BIDIRECTION.DAO.Dao;
import ONE_TO_ONE_BIDIRECTION.DTO.*;

public class Diver 
{
	public static void main(String[] args) 
	{
		Person person = new Person();
		Pancard pancard = new Pancard();
		
		person.setPersonId(2);
		person.setName("rakesh");
		person.setAddress("KARVENAGAR");
		person.setPancard(pancard);
		
		pancard.setPancardId(1002);
		pancard.setName("RP");
		pancard.setAddress("KHOLHAPUR");
		pancard.setPerson(person);
		
		Dao dao = new Dao();
//		dao.savePerson(person);
//		dao.deletePerson(1);
//		dao.updatePerson(1);
		dao.fetchPerson(1);
	}

}
