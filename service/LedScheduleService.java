package com.example.service;

import java.util.List;
import com.example.model.LedSchedule;

public interface LedScheduleService {
	public LedSchedule create(LedSchedule ledschedule);

	public LedSchedule delete(Integer id);

	public List<LedSchedule> findAll();

	public LedSchedule update(LedSchedule ledschedule);

	public LedSchedule findById(Integer id);
}
