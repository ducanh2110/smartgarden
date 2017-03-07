package com.example.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Fan;

import com.example.repository.FanRepository;
import com.example.service.FanService;

@Service
public class FanServiceImpl implements FanService  {
	
	@Resource
	private FanRepository fan_repository;
	
	@Override
	public Fan create(Fan fan) {
		return fan_repository.save(fan);
	}

	@Override
	public Fan delete(Integer id) {
		Fan fan = fan_repository.findOne(id);
		if (fan != null)
			fan_repository.delete(fan);

		return null;
	}

	@Override
	public List<Fan> findAll() {
			return fan_repository.findAll();
	}

	@Override
	public Fan update(Fan fan) {
		Fan fan_update = fan_repository.save(fan);
		if (fan_update != null)
			return fan_update;

		return null;
	}
	@Transactional
	@Override
	public Fan findById(Integer id) {
		if (id != null)
			return fan_repository.findOne(id);

		return null;
	}
	

}
