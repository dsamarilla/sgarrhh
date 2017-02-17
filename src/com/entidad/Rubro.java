package com.entidad;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="hab_codrubro")
public class Rubro implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	
	@Column(name="rub_cod")
	@OneToMany
	(mappedBy="Haber", cascade={CascadeType.PERSIST}, orphanRemoval=true)
	
	private Integer codigo;
	@Column(name="rub_des")
	private String descripcion;
	
	public Rubro() {
		super();
		this.codigo = 0;
		this.descripcion = "";	
		}
	public Rubro(Integer codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
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
	@Override
	public String toString() {
		return "Rubro [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}
	
	
}
