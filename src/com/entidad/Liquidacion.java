package com.entidad;

import java.util.Date;

public class Liquidacion {
	
	private Integer numero;
	private Persona codigoPersona;
	private Date fecha;
	private Double monto;
	private String observacion;
	private Concepto codigoConcepto;
	
	public Liquidacion() {
		super();
		this.numero = 0;
		this.codigoPersona = new Persona();
		this.fecha = new Date ();
		this.monto = new Double(0);
		this.observacion = "";
		this.codigoConcepto = new Concepto();
	}

	public Liquidacion(Integer numero, Persona codigoPersona, Date fecha, Double monto, String observacion,
			Concepto codigoConcepto) {
		super();
		this.numero = numero;
		this.codigoPersona = codigoPersona;
		this.fecha = fecha;
		this.monto = monto;
		this.observacion = observacion;
		this.codigoConcepto = codigoConcepto;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Persona getCodigoPersona() {
		return codigoPersona;
	}

	public void setCodigoPersona(Persona codigoPersona) {
		this.codigoPersona = codigoPersona;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Concepto getCodigoConcepto() {
		return codigoConcepto;
	}

	public void setCodigoConcepto(Concepto codigoConcepto) {
		this.codigoConcepto = codigoConcepto;
	}

	@Override
	public String toString() {
		return "Liquidacion [numero=" + numero + ", codigoPersona=" + codigoPersona + ", fecha=" + fecha + ", monto="
				+ monto + ", observacion=" + observacion + ", codigoConcepto=" + codigoConcepto + "]";
	}

	
	
	
}
