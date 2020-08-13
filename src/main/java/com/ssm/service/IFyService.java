package com.ssm.service;

import java.util.List;

import com.ssm.model.TFy;

public interface IFyService {

	public List<TFy> getAllFY();

	public int AddFy(TFy fy);
}
