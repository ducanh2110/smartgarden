package com.example.service;

import java.util.List;

import com.example.model.Water;;



public interface WaterService {
	public Water create(Water waterPump);

	public Water delete(Integer id);

	public List<Water> findAll();

	public Water update(Water waterPump);

	public Water findById(Integer id);
}
