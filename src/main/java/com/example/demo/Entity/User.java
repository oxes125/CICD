package com.example.demo.Entity;

import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class User {

	private String nombre;
	private String apellido;
	private int edad;
	
	
	public User(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(apellido, other.apellido) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "User [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}


	
	
}
