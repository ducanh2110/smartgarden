package com.example.service;

import java.util.List;

import com.example.model.Led;

public interface LedService {
	public Led create(Led led);

	public Led delete(Integer id);

	public List<Led> findAll();

	public Led update(Led led);

	public Led findById(Integer id);
}
