package com.entidad;

import java.util.Date;

public class Contrato {

	private Integer numero;
	private String descripcion;
	private Salario codSalario;
	private Persona codPersona;
	private Cargo codCargo;
	private Date fechaIngreso;
	
	public Contrato() {
		this.numero = 0;
		this.descripcion = "";
		this.codSalario = new Salario();
		this.codPersona = new Persona();
		this.codCargo = new Cargo();
		this.fechaIngreso = new Date();	}

	public Contrato(Integer numero, String descripcion, Salario codSalario, Persona codPersona, Cargo codCargo,
			Date fechaIngreso) {
		super();
		this.numero = numero;
		this.descripcion = descripcion;
		this.codSalario = codSalario;
		this.codPersona = codPersona;
		this.codCargo = codCargo;
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Salario getCodSalario() {
		return codSalario;
	}

	public void setCodSalario(Salario codSalario) {
		this.codSalario = codSalario;
	}

	public Persona getCodPersona() {
		return codPersona;
	}

	public void setCodPersona(Persona codPersona) {
		this.codPersona = codPersona;
	}

	public Cargo getCodCargo() {
		return codCargo;
	}

	public void setCodCargo(Cargo codCargo) {
		this.codCargo = codCargo;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Contrato [numero=" + numero + ", descripcion=" + descripcion + ", codPersona=" + codPersona
				+ ", codCargo=" + codCargo + ", fechaIngreso=" + fechaIngreso + "]";
	}

}
