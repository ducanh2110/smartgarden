package com.example.service;

import java.util.List;

import com.example.model.HoaLy;

public interface HoaLyService {
	public HoaLy create(HoaLy hoaly);

	public HoaLy delete(Integer id);

	public List<HoaLy> findAll();

	public HoaLy update(HoaLy hoaly);

	public HoaLy findById(Integer id);

}
