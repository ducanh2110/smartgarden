package com.example.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Water;

import com.example.repository.WaterRepository;
import com.example.service.WaterService;

@Service
public class WaterServiceImpl implements WaterService  {
	
	@Resource
	private WaterRepository waterPump_repository;
	
	@Override
	public Water create(Water waterPump) {
		return waterPump_repository.save(waterPump);
	}

	@Override
	public Water delete(Integer id) {
		Water waterPump = waterPump_repository.findOne(id);
		if (waterPump != null)
			waterPump_repository.delete(waterPump);

		return null;
	}

	@Override
	public List<Water> findAll() {
			return waterPump_repository.findAll();
	}

	@Override
	public Water update(Water waterPump) {
		Water waterPump_update = waterPump_repository.save(waterPump);
		if (waterPump_update != null)
			return waterPump_update;

		return null;
	}
	@Transactional
	@Override
	public Water findById(Integer id) {
		if (id != null)
			return waterPump_repository.findOne(id);

		return null;
	}
	

}
