package com.example.service;

import java.util.List;
import com.example.model.FanSchedule;

public interface FanScheduleService {
	public FanSchedule create(FanSchedule fanschedule);

	public FanSchedule delete(Integer id);

	public List<FanSchedule> findAll();

	public FanSchedule update(FanSchedule fanschedule);

	public FanSchedule findById(Integer id);
}
