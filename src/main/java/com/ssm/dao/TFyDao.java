package com.ssm.dao;

import java.util.List;

import com.ssm.model.TFy;

public interface TFyDao {
	
	
	public List<TFy> getAllFY();
	
	public int addFy(TFy fy);

}
