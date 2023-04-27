package MainJPA;

import configuration.Conn;
import jakarta.persistence.EntityManager;
import model.Doctor;
import model.Cita;;

public class principal {
	public static void main(String [] args) throws InterruptedException {
	EntityManager en = Conn.getInstancia().getFactory().createEntityManager();
	
	Doctor doctor1 = new Doctor();
	doctor1.setNom_doctor("Axel");
	doctor1.setEsp_doctor("Dermatologia");
	
	Doctor doctor2 = new Doctor();
	doctor2.setNom_doctor("Kaori");
	doctor2.setEsp_doctor("Obstetricia");
	
	Doctor doctor3 = new Doctor();
	doctor3.setNom_doctor("Richard");
	doctor3.setEsp_doctor("Oftalmologia");
	
	en.getTransaction().begin();
	en.persist(doctor1);
	System.out.println("Agregado un doctor");
	Thread.sleep(1000);
	en.persist(doctor2);
	System.out.println("Agregado el segundo doctor");
	Thread.sleep(1000);
	en.persist(doctor3);
	System.out.println("Agregado el tercer doctor");
	Thread.sleep(1000);
	en.getTransaction().commit();
	
	System.out.println("Subida Terminada!!");
	
	
	}
}
