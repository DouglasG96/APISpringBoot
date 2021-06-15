package com.api.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="Usuarios")
public class Usuarios  implements Serializable{
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int idusuario;
		private String nombreUsuario;
		private String clave;
		private int estado;
		private int rol;
		private int idPersona;
		@Column
		@Temporal(TemporalType.DATE)
		private Date createAt;
		
		
		public Usuarios() {
			super();
		}


		public Usuarios(int idusuario, String nombreUsuario, String clave, int estado, int rol, int idPersona,
				Date createAt) {
			super();
			this.idusuario = idusuario;
			this.nombreUsuario = nombreUsuario;
			this.clave = clave;
			this.estado = estado;
			this.rol = rol;
			this.idPersona = idPersona;
			this.createAt = createAt;
		}


		public int getIdusuario() {
			return idusuario;
		}


		public void setIdusuario(int idusuario) {
			this.idusuario = idusuario;
		}


		public String getNombreUsuario() {
			return nombreUsuario;
		}


		public void setNombreUsuario(String nombreUsuario) {
			this.nombreUsuario = nombreUsuario;
		}


		public String getClave() {
			return clave;
		}


		public void setClave(String clave) {
			this.clave = clave;
		}


		public int getEstado() {
			return estado;
		}


		public void setEstado(int estado) {
			this.estado = estado;
		}


		public int getRol() {
			return rol;
		}


		public void setRol(int rol) {
			this.rol = rol;
		}


		public int getIdPersona() {
			return idPersona;
		}


		public void setIdPersona(int idPersona) {
			this.idPersona = idPersona;
		}


		public Date getCreateAt() {
			return createAt;
		}


		public void setCreateAt(Date createAt) {
			this.createAt = createAt;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		/*
	    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "idPersona", nullable = false)
	    private Usuarios usuario;
	    */
		
		
}
