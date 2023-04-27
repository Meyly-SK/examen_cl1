package model;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_cita")
public class Cita implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "cita_id")
	private int c_id;
	
	@Column(name= "num_cita")
	private int n_cita;
	
	@Column(name= "fecha_cita")
	private String f_Cita;
	
	@Column(name = "nom_paciente")
	private String nom_paciente;
	
	@ManyToOne
	@JoinColumn(name = "cita_doctor")
	private Doctor cita_doctor;

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public int getN_cita() {
		return n_cita;
	}

	public void setN_cita(int n_cita) {
		this.n_cita = n_cita;
	}

	public String getF_Cita() {
		return f_Cita;
	}

	public void setF_Cita(String f_Cita) {
		this.f_Cita = f_Cita;
	}

	public String getNom_paciente() {
		return nom_paciente;
	}

	public void setNom_paciente(String nom_paciente) {
		this.nom_paciente = nom_paciente;
	}

	public Doctor getC_doctor() {
		return cita_doctor;
	}

	public void setC_doctor(Doctor c_doctor) {
		this.cita_doctor = c_doctor;
	}
	
	
}
