package com.example.serviceImpl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.model.FanSchedule;
import com.example.repository.FanScheduleRepository;
import com.example.service.FanScheduleService;;

@Service
public class FanScheduleServiceImpl implements FanScheduleService  {
	
	@Resource
	private FanScheduleRepository fanschedule_repository;
	
	@Override
	public FanSchedule create(FanSchedule fanschedule) {
		return fanschedule_repository.save(fanschedule);
	}

	@Override
	public FanSchedule delete(Integer id) {
		FanSchedule fanschedule = fanschedule_repository.findOne(id);
		if (fanschedule != null)
			fanschedule_repository.delete(fanschedule);

		return null;
	}

	@Override
	public List<FanSchedule> findAll() {
			return fanschedule_repository.findAll();
	}

	@Override
	public FanSchedule update(FanSchedule fanschedule) {
		FanSchedule update = fanschedule_repository.save(fanschedule);
		if (update != null)
			return update;

		return null;
	}
	@Transactional
	@Override
	public FanSchedule findById(Integer id) {
		if (id != null)
			return fanschedule_repository.findOne(id);

		return null;
	}
}
