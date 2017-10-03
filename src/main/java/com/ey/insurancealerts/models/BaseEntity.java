package com.ey.insurancealerts.models;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 
 * @author Larsen.Raja
 *
 */
public class BaseEntity {

	private String _id = null;
	private String _rev = null;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String get_rev() {
		return _rev;
	}
	public void set_rev(String _rev) {
		this._rev = _rev;
	}
	
	public BaseEntity(String _id) {
		this._id = _id;
	}
	
	public BaseEntity() {}
	@Override
	public String toString() {
		  return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
	
	
}