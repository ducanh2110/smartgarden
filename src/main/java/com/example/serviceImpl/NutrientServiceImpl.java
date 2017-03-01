package com.example.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Nutrient;

import com.example.repository.NutrientRepository;
import com.example.service.NutrientService;

@Service
public class NutrientServiceImpl implements NutrientService  {
	
	@Resource
	private NutrientRepository nutrientPump_repository;
	
	@Override
	public Nutrient create(Nutrient nutrientPump) {
		return nutrientPump_repository.save(nutrientPump);
	}

	@Override
	public Nutrient delete(Integer id) {
		Nutrient nutrientPump = nutrientPump_repository.findOne(id);
		if (nutrientPump != null)
			nutrientPump_repository.delete(nutrientPump);

		return null;
	}

	@Override
	public List<Nutrient> findAll() {
			return nutrientPump_repository.findAll();
	}

	@Override
	public Nutrient update(Nutrient nutrientPump) {
		Nutrient nutrientPump_update = nutrientPump_repository.save(nutrientPump);
		if (nutrientPump_update != null)
			return nutrientPump_update;

		return null;
	}
	@Transactional
	@Override
	public Nutrient findById(Integer id) {
		if (id != null)
			return nutrientPump_repository.findOne(id);

		return null;
	}
	

}
