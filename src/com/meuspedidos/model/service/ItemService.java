package com.meuspedidos.model.service;

import java.util.List;

import javax.inject.Inject;

import com.meuspedidos.model.Item;
import com.meuspedidos.model.dao.ItemInterface;

public class ItemService implements ItemServiceInterface {
	
	@Inject
	private ItemInterface itemInterface;

	@Override
	public List<Item> getItens() {
		return itemInterface.getItens();
	}

}
