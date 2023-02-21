package com.devpredator.practicajsf.entity;

/**
 * Clase que representa a un Gerente.
 * @author Calistos
 *
 */
public class Gerente {

	/**
	 * Nombre del gerente.
	 */
	private String nombre;
	/**
	 * Primer apellido del gerente.
	 */
	private String primerApellido;
	/**
	 * Segundo apellido del gerente.
	 */
	private String segundoApellido;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	
	/**
	 * Metodo encargado de devolver toda la informacion del gerente.
	 */
	public String toString() {
		return this.nombre + " " + this.segundoApellido + " " + this.segundoApellido;
	}
}
