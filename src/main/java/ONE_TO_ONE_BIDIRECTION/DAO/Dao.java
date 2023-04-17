package ONE_TO_ONE_BIDIRECTION.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ONE_TO_ONE_BIDIRECTION.DTO.Person;

public class Dao
{

	public void savePerson(Person person) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saurabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		
	}

	public void deletePerson(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saurabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Person person =	entityManager.find(Person.class, id);
		entityManager.persist(person);
		entityTransaction.commit();
		
	}

	public void updatePerson(int id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saurabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Person person =	entityManager.find(Person.class, id);
		person.setName("saurabhgambhire");
		person.setPersonId(id);
		entityManager.merge(person);
		entityTransaction.commit();
	}

	public void fetchPerson(int id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saurabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person person = entityManager.find(Person.class, id);
		System.out.println(person);
	}
	
}
