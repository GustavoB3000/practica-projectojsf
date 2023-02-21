package com.devpredator.practicajsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.services.RestauranteService;

@ManagedBean(name="rest")
@ViewScoped
public class RestauranteController {
	/**
	 * Listado de restaurantes para la tabla.
	 */
	private List<Restaurante> restaurantes;
	/**
	 * Servicio con los metodos que realiza la logica de negocio de restaurantes.
	 */
	private RestauranteService rs = new RestauranteService();

	@PostConstruct
	public void init() {
		this.mostrarRestaurantes();
	}
	
	public void mostrarRestaurantes() {
		this.restaurantes = this.rs.consultarRestaurantes();
	}


	/**
	 * @return the restaurantes
	 */
	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}


	/**
	 * @param restaurantes the restaurantes to set
	 */
	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

	
}
