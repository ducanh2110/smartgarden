package com.example.service;

import java.util.List;

import com.example.model.Flower;

public interface FlowerService {
	public Flower create(Flower hoaly);

	public Flower delete(Integer id);

	public List<Flower> findAll();

	public Flower update(Flower hoaly);

	public Flower findById(Integer id);

}
