package com.entidad;

import java.util.Date;

public class Haber {
	private Integer numero;
	private Liquidacion codigoLiquidacion;
	private Float monto;
	private Date fecha;
	private String observacion;
	private Rubro codigoRubro;
	
	public Haber() {
		super();
		this.numero = 0;
		this.codigoLiquidacion = new Liquidacion();
		this.monto = new Float(0);
		this.fecha = new Date();
		this.observacion = "";
		this.codigoRubro= new Rubro();
	}

	public Haber(Integer numero, Liquidacion codigoLiquidacion, Float monto, Date fecha, String observacion, Rubro codigoRubro) {
		super();
		this.numero = numero;
		this.codigoLiquidacion = codigoLiquidacion;
		this.monto = monto;
		this.fecha = fecha;
		this.observacion = observacion;
		this.codigoRubro = codigoRubro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Liquidacion getCodigoLiquidacion() {
		return codigoLiquidacion;
	}

	public void setCodigoLiquidacion(Liquidacion codigoLiquidacion) {
		this.codigoLiquidacion = codigoLiquidacion;
	}

	public Float getMonto() {
		return monto;
	}

	public void setMonto(Float monto) {
		this.monto = monto;
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
	
	

	public Rubro getCodigoRubro() {
		return codigoRubro;
	}

	public void setCodigoRubro(Rubro codigoRubro) {
		this.codigoRubro = codigoRubro;
	}

	@Override
	public String toString() {
		return "Haber [numero=" + numero + ", codigoLiquidacion=" + codigoLiquidacion + ", monto=" + monto + ", fecha="
				+ fecha + ", observacion=" + observacion + ", codigoRubro=" + codigoRubro + "]";
	}


	
	

}
