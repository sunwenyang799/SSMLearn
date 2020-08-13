package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.TFyDao;
import com.ssm.model.TFy;
import com.ssm.service.IFyService;

@Service
public class FyServiceImpl implements IFyService{
	
	@Autowired
	private TFyDao fyDao;

	public int AddFy(TFy fy) {
		
		return fyDao.addFy(fy);
	}

	public List<TFy> getAllFY() {
		
		return fyDao.getAllFY();
	}
	
}
