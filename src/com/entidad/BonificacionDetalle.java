package com.entidad;

import java.util.Date;

public class BonificacionDetalle {
	
	private Integer numero;
	private TipoBonificacion codigoTipoBonificacion;
	private Double monto;
	private Persona codigoPersona;
	private String estado;
	private Date fecha;
	private String observacion;
	
	
	
	public BonificacionDetalle() {
		super();
		this.numero = 0;
		this.codigoTipoBonificacion = new TipoBonificacion();
		this.monto = new Double(0);
		this.codigoPersona = new Persona();
		this.estado = "";
		this.fecha = new Date();
		this.observacion = "";
	}



	public BonificacionDetalle(Integer numero, TipoBonificacion codigoTipoBonificacion, Double monto,
			Persona codigoPersona, String estado, Date fecha, String observacion) {
		super();
		this.numero = numero;
		this.codigoTipoBonificacion = codigoTipoBonificacion;
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



	public TipoBonificacion getCodigoTipoBonificacion() {
		return codigoTipoBonificacion;
	}



	public void setCodigoTipoBonificacion(TipoBonificacion codigoTipoBonificacion) {
		this.codigoTipoBonificacion = codigoTipoBonificacion;
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
		return "BonificacionDetalle [numero=" + numero + ", codigoTipoBonificacion=" + codigoTipoBonificacion
				+ ", monto=" + monto + ", codigoPersona=" + codigoPersona + ", estado=" + estado + ", fecha=" + fecha
				+ ", observacion=" + observacion + "]";
	}
	
	
	

}
