package com.entidad;

public class TipoBonificacion {
	
	private Integer codigo;
	private String descripcion;
	private Float porcentaje;
	
	public TipoBonificacion() {
		super();
		this.codigo = 0;
		this.descripcion = "";
		this.porcentaje = new Float(0);
	}

	public TipoBonificacion(Integer codigo, String descripcion, Float porcentaje) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.porcentaje = porcentaje;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() {
		return "TipoBonificacion[codigo=" + codigo + ", descripcion=" + descripcion + ", porcentaje=" + porcentaje + "]";
	}

	
	
}
