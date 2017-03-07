package com.example.serviceImpl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.model.Flower;
import com.example.repository.FlowerRepository;
import com.example.service.FlowerService;

@Service
public class FlowerServiceImpl implements FlowerService {

	@Resource
	private FlowerRepository repository;

	@Override
	public Flower create(Flower hoaly) {
		return repository.save(hoaly);
	}

	@Override
	public Flower delete(Integer id) {
		Flower hoaLy = repository.findOne(id);
		if (hoaLy != null)
			repository.delete(hoaLy);

		return null;
	}

	@Override
	public List<Flower> findAll() {
		return repository.findAll();
	}

	@Override
	public Flower update(Flower hoaLy) {
		Flower hl = repository.save(hoaLy);
		if (hl != null)
			return hl;

		return null;
	}

	@Override
	@Transactional
	public Flower findById(Integer id) {
		if (id != null)
			return repository.findOne(id);

		return null;
	}

}
