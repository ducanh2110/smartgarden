package com.example.serviceImpl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.model.LedSchedule;
import com.example.repository.LedScheduleRepository;
import com.example.service.LedScheduleService;;

@Service
public class LedScheduleServiceImpl implements LedScheduleService  {
	
	@Resource
	private LedScheduleRepository ledschedule_repository;
	
	@Override
	public LedSchedule create(LedSchedule ledschedule) {
		return ledschedule_repository.save(ledschedule);
	}

	@Override
	public LedSchedule delete(Integer id) {
		LedSchedule ledschedule = ledschedule_repository.findOne(id);
		if (ledschedule != null)
			ledschedule_repository.delete(ledschedule);

		return null;
	}

	@Override
	public List<LedSchedule> findAll() {
			return ledschedule_repository.findAll();
	}

	@Override
	public LedSchedule update(LedSchedule ledschedule) {
		LedSchedule update = ledschedule_repository.save(ledschedule);
		if (update != null)
			return update;

		return null;
	}
	@Transactional
	@Override
	public LedSchedule findById(Integer id) {
		if (id != null)
			return ledschedule_repository.findOne(id);

		return null;
	}
}
