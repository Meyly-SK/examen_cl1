package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import model.Cita;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_doctor")
public class Doctor implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "doctor_id")
	private int d_id;
	
	@Column(name= "nom_doctor")
	private String nom_doctor;
	
	@Column(name="esp_doctor")
	private String esp_doctor;
	
	@OneToMany(mappedBy = "cita_doctor")
	List<Cita> citas = new ArrayList<Cita>();

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getNom_doctor() {
		return nom_doctor;
	}

	public void setNom_doctor(String nom_doctor) {
		this.nom_doctor = nom_doctor;
	}

	public String getEsp_doctor() {
		return esp_doctor;
	}

	public void setEsp_doctor(String esp_doctor) {
		this.esp_doctor = esp_doctor;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}
	
	
	
}
















