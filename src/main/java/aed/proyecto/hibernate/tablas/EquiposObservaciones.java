package aed.proyecto.hibernate.tablas;

import javax.persistence.Column;
import javax.persistence.Id;

public class EquiposObservaciones {

	@Id
	@Column(columnDefinition = "int(11)")
	private int codEquipo;
	@Column(columnDefinition = "varchar(200)")
	private String observaciones;

	public int getCodEquipo() {
		return codEquipo;
	}

	public void setCodEquipo(int codEquipo) {
		this.codEquipo = codEquipo;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
