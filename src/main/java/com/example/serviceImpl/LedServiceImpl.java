package com.example.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Fan;
import com.example.model.Led;

import com.example.repository.LedRepository;
import com.example.service.LedService;
@Service
public class LedServiceImpl implements LedService {
	
	@Resource
	private LedRepository led_repository;
	
	@Override
	public Led create(Led led) {
		
		return led_repository.save(led);
	}

	@Override
	public Led delete(Integer id) {
		Led led = led_repository.findOne(id);
		if (led != null)
			led_repository.delete(led);

		return null;
		
	}

	@Override
	public List<Led> findAll() {
		return led_repository.findAll();
	}

	@Override
	public Led update(Led led) {
		Led led_update = led_repository.save(led);
		if (led_update != null)
			return led_update;

		return null;
	}

	@Transactional
	@Override
	public Led findById(Integer id) {
		if (id != null)
			return led_repository.findOne(id);

		return null;
	}
	

}
