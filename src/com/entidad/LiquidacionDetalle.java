package com.entidad;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rhlq_liquidacion_detalle")

public class LiquidacionDetalle implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="lqd_id")
	private Integer idLiquidacionDetalle;
	
	
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="lqd_idliquidacion")
	private Liquidacion idLiquidacion;
	
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="lqd_idconcepto")
	private Concepto idConcepto;

	@Column(name="lqd_montoparcial")
	private Double montoParcial;
	
	public LiquidacionDetalle() {
		super();
		this.idLiquidacionDetalle =0;
		this.idConcepto = new Concepto();
		this.idLiquidacion = new Liquidacion();
		this.montoParcial = new Double(0);
	}
	public LiquidacionDetalle(Integer idLiquidacionDetalle, Concepto idConcepto, Liquidacion idLiquidacion, Double montoParcial) {
		super();
		this.idLiquidacionDetalle = idLiquidacionDetalle;
		this.idConcepto = idConcepto;
		this.idLiquidacion = idLiquidacion;
		this.montoParcial = montoParcial;
		
	}
	
	
	public Integer getIdLiquidacionDetalle() {
		return idLiquidacionDetalle;
	}
	public void setIdLiquidacionDetalle(Integer idLiquidacionDetalle) {
		this.idLiquidacionDetalle = idLiquidacionDetalle;
	}
	public Concepto getidConcepto() {
		return idConcepto;
	}
	public void setidConcepto(Concepto idConcepto) {
		this.idConcepto = idConcepto;
	}
	public Liquidacion getidLiquidacion() {
		return idLiquidacion;
	}
	public void setidLiquidacion(Liquidacion idLiquidacion) {
		this.idLiquidacion = idLiquidacion;
	}
	public Double getMontoParcial() {
		return montoParcial;
	}
	public void setMontoParcial(Double montoParcial) {
		this.montoParcial = montoParcial;
	}
	@Override
	public String toString() {
		return "LiquidacionDetalle [idConcepto=" + idConcepto + ", idLiquidacion=" + idLiquidacion
				+ ", montoParcial=" + montoParcial + "]";
	}
	
	
	
}
