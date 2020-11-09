package aed.proyecto.hibernate.tablas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "int(11)")
	private int codEquipo;
	@Column(columnDefinition = "varchar(40)")
	private String nomEquipo;
	@Column(columnDefinition = "char(5)")
	private String codLiga;
	@Column(columnDefinition = "varchar(60)")
	private String localidad;
	private byte internacional;

	public int getCodEquipo() {
		return codEquipo;
	}

	public String getNomEquipo() {
		return nomEquipo;
	}

	public void setNomEquipo(String nomEquipo) {
		this.nomEquipo = nomEquipo;
	}

	public String getCodLiga() {
		return codLiga;
	}

	public void setCodLiga(String codLiga) {
		this.codLiga = codLiga;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public byte getInternacional() {
		return internacional;
	}

	public void setInternacional(byte internacional) {
		this.internacional = internacional;
	}

}
