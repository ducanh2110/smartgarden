package com.example.service;

import java.util.List;

import com.example.model.Nutrient;;



public interface NutrientService {
	public Nutrient create(Nutrient nutrientPump);

	public Nutrient delete(Integer id);

	public List<Nutrient> findAll();

	public Nutrient update(Nutrient nutrientPump);

	public Nutrient findById(Integer id);
}
