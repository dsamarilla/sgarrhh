package com.entidad;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class Descuento {
	@Id
	@Column(name="deb_num")
	private Integer numero;
	private TipoDescuento codigoTipoDescuento;
	private Double monto;
	private Persona codigoPersona;
	private String estado;
	private Date fecha;
	private String observacion;
	
		
	public Descuento() {
		super();
		this.numero = 0;
		this.codigoTipoDescuento = new TipoDescuento();
		this.monto = new Double(0);
		this.codigoPersona = new Persona();
		this.estado = "";
		this.fecha = new Date();
		this.observacion = "";
	}


	public Descuento(Integer numero, TipoDescuento codigoTipoDescuento, Double monto,
			Persona codigoPersona, String estado, Date fecha, String observacion) {
		super();
		this.numero = numero;
		this.codigoTipoDescuento = codigoTipoDescuento;
		this.monto = monto;
		this.codigoPersona = codigoPersona;
		this.estado = estado;
		this.fecha = fecha;
		this.observacion = observacion;
	}


	public Integer getCodigo() {
		return numero;
	}



	public void setCodigo(Integer codigo) {
		this.numero = codigo;
	}



	public TipoDescuento getcodigoTipoDescuento() {
		return codigoTipoDescuento;
	}



	public void setcodigoTipoDescuento(TipoDescuento codigoTipoDescuento) {
		this.codigoTipoDescuento = codigoTipoDescuento;
	}



	public Double getMonto() {
		return monto;
	}



	public void setMonto(Double monto) {
		this.monto = monto;
	}



	public Persona getCodigoPersona() {
		return codigoPersona;
	}



	public void setCodigoPersona(Persona codigoPersona) {
		this.codigoPersona = codigoPersona;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public String getObservacion() {
		return observacion;
	}



	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}



	@Override
	public String toString() {
		return "Bonificacion [numero=" + numero + ", codigoTipoDescuento=" + codigoTipoDescuento
				+ ", monto=" + monto + ", codigoPersona=" + codigoPersona + ", estado=" + estado + ", fecha=" + fecha
				+ ", observacion=" + observacion + "]";
	}
	
	
	

}
