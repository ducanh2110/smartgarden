package com.example.service;

import java.util.List;
import com.example.model.NutrientSchedule;

public interface NutrientScheduleService {
	public NutrientSchedule create(NutrientSchedule nutrientschedule);

	public NutrientSchedule delete(Integer id);

	public List<NutrientSchedule> findAll();

	public NutrientSchedule update(NutrientSchedule nutrientschedule);

	public NutrientSchedule findById(Integer id);
}
