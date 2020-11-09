package aed.proyecto.hibernate.tablas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ligas {

	@Id
	@Column(columnDefinition = "char(5)")
	private String codLiga;
	@Column(columnDefinition = "varchar(50)")
	private String nomLiga;

	public String getCodLiga() {
		return codLiga;
	}

	public void setCodLiga(String codLiga) {
		this.codLiga = codLiga;
	}

	public String getNomLiga() {
		return nomLiga;
	}

	public void setNomLiga(String nomLiga) {
		this.nomLiga = nomLiga;
	}

}
