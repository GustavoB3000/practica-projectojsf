package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Gerente;
import com.devpredator.practicajsf.entity.Restaurante;

/**
 * Clase encargada de mostrar los restaurantes en la pantalla principal.
 * @author Calistos
 *
 */
public class RestauranteService {

	public List<Restaurante> consultarRestaurantes(){
		
		//Listado de restaurantes:
		List<Restaurante> restaurantes = new ArrayList<>();
		
		//Gerentes:
		Gerente g1 = new Gerente();
		Gerente g2 = new Gerente();
		Gerente g3 = new Gerente();
		Gerente g4 = new Gerente();
		Gerente g5 = new Gerente();
		
		g1.setNombre("Axel");
		g1.setPrimerApellido("Peralta");
		g1.setSegundoApellido("Dalex");
		
		g2.setNombre("Alexis");
		g2.setPrimerApellido("Avila");
		g2.setSegundoApellido("Ramon");
		
		g3.setNombre("Mario");
		g3.setPrimerApellido("Bearzi");
		g3.setSegundoApellido("Rodriguez");
		
		g4.setNombre("Nilda");
		g4.setPrimerApellido("Carnero");
		g4.setSegundoApellido("Rodriguez");
		
		g5.setNombre("Gladys");
		g5.setPrimerApellido("Bearzi");
		g5.setSegundoApellido("Rodriguez");
		
		
		Restaurante r1 = new Restaurante();
		Restaurante r2 = new Restaurante();
		Restaurante r3 = new Restaurante();
		Restaurante r4 = new Restaurante();
		Restaurante r5 = new Restaurante();
		
		r1.setNombre("McDonald");
		r1.setDireccion("Av. Porongol 132");
		r1.setPais("Argentina");
		r1.setGerente(g1);
		
		r2.setNombre("El noble");
		r2.setDireccion("Av. Ruile 1322");
		r2.setPais("Argentina");
		r2.setGerente(g2);
		
		r3.setNombre("Red Wine");
		r3.setDireccion("Las serranas 132");
		r3.setPais("Argentina");
		r3.setGerente(g3);
		
		r4.setNombre("Burger King");
		r4.setDireccion("Las malvinas 12");
		r4.setPais("Argentina");
		r4.setGerente(g4);
		
		r5.setNombre("Coronch");
		r5.setDireccion("Av. Guillers 132");
		r5.setPais("Argentina");
		r5.setGerente(g5);
		
		restaurantes.add(r1);
		restaurantes.add(r2);
		restaurantes.add(r3);
		restaurantes.add(r4);
		restaurantes.add(r5);
		
		return restaurantes;
	}
}
