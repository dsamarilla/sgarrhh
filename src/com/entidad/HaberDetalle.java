/**
 * 
 */
package com.entidad;

/**
 * @author cvargas
 *
 */
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rhlq_haber_detalle")

public class HaberDetalle implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@Column(name="had_id")
	private Integer id;
	
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="had_idhaber")
	private Haber idHaber;
	
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="had_idconcep")
	private Concepto idConcepto;
	
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="had_idliq")
	private Liquidacion idLiquidacion;
	
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="had_iddescue")
	private Descuento idDescuento;
	
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="had_idboni")
	private Bonificacion idBonificacion;
	
	
	
	public HaberDetalle() {
		// TODO Auto-generated constructor stub
		
		super();
		this.idHaber = new Haber();
		this.idConcepto = new Concepto();
		this.idLiquidacion = new Liquidacion();
		this.idDescuento = new Descuento() ;
		this.idBonificacion = new Bonificacion();
		
	}

	public HaberDetalle(Haber idHaber, Concepto idConcepto, Liquidacion idLiquidacion,
			Descuento idDescuento, Bonificacion idBonificacion) {
		super();
		this.idHaber = idHaber;
		this.idConcepto = idConcepto;
		this.idLiquidacion = idLiquidacion;
		this.idDescuento = idDescuento;
		this.idBonificacion = idBonificacion;
	}

	

	public Haber getidHaber() {
		return idHaber;
	}

	public void setidHaber(Haber idHaber) {
		this.idHaber = idHaber;
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

	public Descuento getidDescuento() {
		return idDescuento;
	}

	public void setidDescuento(Descuento idDescuento) {
		this.idDescuento = idDescuento;
	}

	public Bonificacion getidBonificacion() {
		return idBonificacion;
	}

	public void setidBonificacion(Bonificacion idBonificacion) {
		this.idBonificacion = idBonificacion;
	}

	@Override
	public String toString() {
		return "HaberDetalle [numero=" + idHaber + ", idConcepto=" + idConcepto + ", idLiquidacion="
				+ idLiquidacion + ", idDescuento=" + idDescuento + ", idBonificacion="
				+ idBonificacion + "]";
	}
    
	
	
}
