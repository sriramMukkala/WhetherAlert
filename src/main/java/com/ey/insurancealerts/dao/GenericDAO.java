package com.ey.insurancealerts.dao;

import java.util.List;

import com.cloudant.client.api.model.Response;

public interface GenericDAO<E, T> {

	E create(E e);
	
	List<Response> createMany(List<E> entities);
	
	void delete(T id);
	
	E find(E e);
	
	E update(E e);
	
}

