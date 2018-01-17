package com.meuspedidos.model.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.meuspedidos.model.Item;

@Path("/itens")
@Produces({MediaType.APPLICATION_JSON,
	MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class ItemFacede {
	
	static List<Item> listaItens = new ArrayList<Item>();
	
	static {
		listaItens.add(new Item("Millenium Falcon", 0, 550.000, 1));
		listaItens.add(new Item("X-Wing", 0, 60.000, 2));
		listaItens.add(new Item("Super Star Destroyer", 0, 4570.000, 1));
		listaItens.add(new Item("TIE Fighter", 0, 75.000, 2));
		listaItens.add(new Item("Lightsaber", 0, 6.000, 5));
		listaItens.add(new Item("DLT-19 Heavy Blaster Rifle", 0, 5.800, 1));
		listaItens.add(new Item("DL-44 Heavy Blaster Pistol", 0, 1.500, 10));
	}
	
	@GET
	public List<Item> getItens(){
		return listaItens;
	}

}
