package com.entidad;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class LiquidacionDetalle implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="lqd_codconcepto")
	private Concepto codigoConcepto;
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="lqd_nroliquidacion")
	private Liquidacion numeroLiquidacion;
	private Double montoParcial;
	public LiquidacionDetalle() {
		super();
		this.codigoConcepto = new Concepto();
		this.numeroLiquidacion = new Liquidacion();
		this.montoParcial = new Double(0);
	}
	public LiquidacionDetalle(Concepto codigoConcepto, Liquidacion numeroLiquidacion, Double montoParcial) {
		super();
		this.codigoConcepto = codigoConcepto;
		this.numeroLiquidacion = numeroLiquidacion;
		this.montoParcial = montoParcial;
	}
	public Concepto getCodigoConcepto() {
		return codigoConcepto;
	}
	public void setCodigoConcepto(Concepto codigoConcepto) {
		this.codigoConcepto = codigoConcepto;
	}
	public Liquidacion getNumeroLiquidacion() {
		return numeroLiquidacion;
	}
	public void setNumeroLiquidacion(Liquidacion numeroLiquidacion) {
		this.numeroLiquidacion = numeroLiquidacion;
	}
	public Double getMontoParcial() {
		return montoParcial;
	}
	public void setMontoParcial(Double montoParcial) {
		this.montoParcial = montoParcial;
	}
	@Override
	public String toString() {
		return "LiquidacionDetalle [codigoConcepto=" + codigoConcepto + ", numeroLiquidacion=" + numeroLiquidacion
				+ ", montoParcial=" + montoParcial + "]";
	}
	
	
	
}
