package com.entidad;

public class Cargo {
	private Integer codigo;
	private String descripcion;
	private Funcion funcion;
	private Departamento departamento;
	public Cargo() {
		super();
		this.codigo = 0;
		this.descripcion = "";	
		this.funcion=new Funcion();
		this.departamento=new Departamento();
		}
	public Cargo(Integer codigo, String descripcion,Funcion funcion,Departamento departamento) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.funcion=funcion;
		this.departamento=departamento;
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
	
	
	public Funcion getFuncion() {
		return funcion;
	}
	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Cargo [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}
	
	
}
