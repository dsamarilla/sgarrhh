package com.entidad;

public class Salario {
	private Integer codigo;
	private String descripcion;
	private Double monto;
	
	public Salario() {
		super();
		this.codigo = 0;
		this.descripcion = "";	
		this.monto = new Double(0);	
		}
	
	public Salario(Integer codigo, String descripcion, Double monto) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.monto= monto;
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
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	@Override
	public String toString() {
		return "Salario [codigo=" + codigo + ", descripcion=" + descripcion + ", monto=" + monto + "]";
	}
	
	
}
