package com.example.serviceImpl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.model.NutrientSchedule;
import com.example.repository.NutrientScheduleRepository;
import com.example.service.NutrientScheduleService;;

@Service
public class NutrientScheduleServiceImpl implements NutrientScheduleService  {
	
	@Resource
	private NutrientScheduleRepository nutrientschedule_repository;
	
	@Override
	public NutrientSchedule create(NutrientSchedule nutrientschedule) {
		return nutrientschedule_repository.save(nutrientschedule);
	}

	@Override
	public NutrientSchedule delete(Integer id) {
		NutrientSchedule nutrientschedule = nutrientschedule_repository.findOne(id);
		if (nutrientschedule != null)
			nutrientschedule_repository.delete(nutrientschedule);

		return null;
	}

	@Override
	public List<NutrientSchedule> findAll() {
			return nutrientschedule_repository.findAll();
	}

	@Override
	public NutrientSchedule update(NutrientSchedule nutrientschedule) {
		NutrientSchedule update = nutrientschedule_repository.save(nutrientschedule);
		if (update != null)
			return update;

		return null;
	}
	@Transactional
	@Override
	public NutrientSchedule findById(Integer id) {
		if (id != null)
			return nutrientschedule_repository.findOne(id);

		return null;
	}
}
