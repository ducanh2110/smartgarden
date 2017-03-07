package com.example.service;

import java.util.List;
import com.example.model.WaterSchedule;

public interface WaterScheduleService {
	public WaterSchedule create(WaterSchedule waterschedule);

	public WaterSchedule delete(Integer id);

	public List<WaterSchedule> findAll();

	public WaterSchedule update(WaterSchedule waterschedule);

	public WaterSchedule findById(Integer id);
}
