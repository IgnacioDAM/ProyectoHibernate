package aed.proyecto.hibernate.tablas;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contratos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "int(11)")
	private int codContrato;
	@Column(columnDefinition = "char(9)")
	private String coddnionie;
	@Column(columnDefinition = "int(11)")
	private int codEquipo;
	private Date fechaInicio;
	private Date fechFin;
	@Column(columnDefinition = "int(11)")
	private int precioAnual;
	@Column(columnDefinition = "int(11)")
	private int precioRescision;

	public int getCodContrato() {
		return codContrato;
	}

	public String getCoddnionie() {
		return coddnionie;
	}

	public void setCoddnionie(String coddnionie) {
		this.coddnionie = coddnionie;
	}

	public int getCodEquipo() {
		return codEquipo;
	}

	public void setCodEquipo(int codEquipo) {
		this.codEquipo = codEquipo;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechFin() {
		return fechFin;
	}

	public void setFechFin(Date fechFin) {
		this.fechFin = fechFin;
	}

	public int getPrecioAnual() {
		return precioAnual;
	}

	public void setPrecioAnual(int precioAnual) {
		this.precioAnual = precioAnual;
	}

	public int getPrecioRescision() {
		return precioRescision;
	}

	public void setPrecioRescision(int precioRescision) {
		this.precioRescision = precioRescision;
	}

}
