package MainJPA;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import configuration.Conn;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import model.Doctor;
import model.Cita;

public class principal {
	public static void main(String [] args) throws InterruptedException {
	EntityManager en = Conn.getInstancia().getFactory().createEntityManager();
	
	/* Doctor doctor1 = new Doctor();
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
	
	
	*/
	
	Scanner sn = new Scanner(System.in);
     boolean salir = false;
     int opcion;

     while (!salir) {

         System.out.println("1. Ingresar Cita");
         System.out.println("2. Mostrar Citas del Doctor");
         System.out.println("3. Salir");

         try {

             System.out.println("Escribe una de las opciones");
             opcion = sn.nextInt();

             switch (opcion) {
                 case 1:
                     System.out.println("Seleccionaste Crear Cita");
                     System.out.println("------------------------");
                     System.out.println("Ingrese Numero de Cita");
                     int num = sn.nextInt();
                     System.out.println("Ingrese la Fecha de la cita");
                     System.out.println("Ingreselo como desee, en la bd esta como varchar");
                     String fec = sn.next();
                     System.out.println("Ingrese el nombre del paciente");
                     String nom = sn.next();
                     System.out.println("Ingrese el nombre del doctor");
                     Scanner sn1 = new Scanner(System.in);
                     
                     Doctor doctor = new Doctor();
                     Thread.sleep(1000);
                     System.out.println("1. Axel");
                     System.out.println("2. Kaori");
                     System.out.println("3. Axel");
                     
                     int doc = sn.nextInt();
                     doctor.setD_id(doc);
                     
                     
                     
                     Cita cita = new Cita();
                     cita.setN_cita(num);
                     cita.setF_Cita(fec);
                     cita.setNom_paciente(nom);
                     cita.setCita_doctor(doctor);
                     Thread.sleep(1000);
                     
                     System.out.println("Cita Completada");
                    
                     en.getTransaction().begin();
                     en.persist(cita);
                     en.getTransaction().commit();
                     Thread.sleep(1000);
                     System.out.println("Cita Subida");
                     
                     break;
                 case 2:
                     System.out.println("Ingreso Citas del Doctor");
                     Thread.sleep(1000);
                     System.out.println("Seleccione el numero del Doctor");
                     Thread.sleep(1000);
                     System.out.println("1. Axel");
                     System.out.println("2. Kaori");
                     System.out.println("3. Axel");
                     
                     Doctor doctor1 = new Doctor();
                     
                    /* int doc1 = sn.nextInt();
                     doctor1.setD_id(doc1);
                     System.out.println("Mostrando Datos");
                     en.getTransaction().begin();
                     String query = "select c from Cita c where c.id_cita = :id";
                     Query q = en.createQuery(query);
                     q.setParameter("id", doctor1);
                     en.getTransaction().commit();
                     List<Cita> lista = q.getResultList();
                     for (int i=0; i< lista.size();i++) {
                    	 System.out.println(lista.get(i).getC_id());
                     }
                     */
                     System.out.println("No logre que listara las Citas");
                     Thread.sleep(1000);
                     System.out.println("Hasta aqui llegue profesor ");
                     Thread.sleep(1000);
                     
                     
                     break;
                 case 3:
                	 salir = true;
                     break;
                 default:
                     System.out.println("Solo números entre 1 y 3");
             }
         } catch (InputMismatchException e) {
             System.out.println("Debes insertar un número");
             sn.next();
         }
     }
	
	}
}
