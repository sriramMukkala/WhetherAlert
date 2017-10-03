package com.ey.insurancealerts.dao;

import java.util.List;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.Response;
import com.ey.insurancealerts.models.BaseEntity;

public class GenericDAOImpl implements GenericDAO<BaseEntity, String> {

	private Database db = CloudantClientMgr.getDB();
	
	@Override
	public BaseEntity create(BaseEntity e) {
		db.save(e);
		return null;
	}

	@Override
	public void delete(String id) {
		db.deleteIndex("_id", id);
	}
	
	@Override
	public BaseEntity find(BaseEntity e) {
		return db.find(e.getClass(), e.get_id() );
	}
	
	@Override
	public BaseEntity update(BaseEntity e) {
		db.update(e);
		return e;
	}
	
	@Override
	public Response createMany(List<BaseEntity> entities) {
		return db.save(entities);
	}

}