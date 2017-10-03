package com.ey.insurancealerts.services;

import com.ey.insurancealerts.dao.GenericDAO;
import com.ey.insurancealerts.dao.GenericDAOImpl;
import com.ey.insurancealerts.models.BaseEntity;

public class UserServices {

	
	GenericDAO<BaseEntity, String> dao = new GenericDAOImpl();
	
	public void addUsers() {
		
	}
	
}
