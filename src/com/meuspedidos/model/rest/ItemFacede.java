package com.meuspedidos.model.rest;

import java.math.BigDecimal;
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
		listaItens.add(new Item("Millenium Falcon", 1, new BigDecimal("550000.00"), 1));
		listaItens.add(new Item("X-Wing", 2, new BigDecimal("60000.00"), 2));
		listaItens.add(new Item("Super Star Destroyer", 1, new BigDecimal("4570000.00"), 1));
		listaItens.add(new Item("TIE Fighter", 2, new BigDecimal("75000.00"), 2));
		listaItens.add(new Item("Lightsaber", 5, new BigDecimal("6000.00"), 5));
		listaItens.add(new Item("DLT-19 Heavy Blaster Rifle", 1, new BigDecimal("5800.00"), 1));
		listaItens.add(new Item("DL-44 Heavy Blaster Pistol", 10, new BigDecimal("1500.00"), 10));
	}
	
	@GET
	public List<Item> getItens(){
		return listaItens;
	}

}
