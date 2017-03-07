package com.example.service;

import java.util.List;

import com.example.model.Fan;



public interface FanService {
	public Fan create(Fan fan);

	public Fan delete(Integer id);

	public List<Fan> findAll();

	public Fan update(Fan fan);

	public Fan findById(Integer id);
}
