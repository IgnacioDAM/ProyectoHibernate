package aed.proyecto.hibernate.tablas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Futbolistas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "char(9)")
	private String coddnionie;
	@Column(columnDefinition = "varchar(50)")
	private String nombre;
	@Column(columnDefinition = "varchar(40)")
	private String nacionalidad;

	public String getCoddnionie() {
		return coddnionie;
	}

	public void setCoddnionie(String coddnionie) {
		this.coddnionie = coddnionie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

}
