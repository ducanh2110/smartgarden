package com.example.serviceImpl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.model.HoaLy;
import com.example.repository.HoaLyRepository;
import com.example.service.HoaLyService;

@Service
public class HoaLyServiceImpl implements HoaLyService {

	@Resource
	private HoaLyRepository repository;

	@Override
	public HoaLy create(HoaLy hoaly) {
		return repository.save(hoaly);
	}

	@Override
	public HoaLy delete(Integer id) {
		HoaLy hoaLy = repository.findOne(id);
		if (hoaLy != null)
			repository.delete(hoaLy);

		return null;
	}

	@Override
	public List<HoaLy> findAll() {
		return repository.findAll();
	}

	@Override
	public HoaLy update(HoaLy hoaLy) {
		HoaLy hl = repository.save(hoaLy);
		if (hl != null)
			return hl;

		return null;
	}

	@Override
	@Transactional
	public HoaLy findById(Integer id) {
		if (id != null)
			return repository.findOne(id);

		return null;
	}

}
