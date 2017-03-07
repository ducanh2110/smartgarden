package com.example.serviceImpl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.model.WaterSchedule;
import com.example.repository.WaterScheduleRepository;
import com.example.service.WaterScheduleService;;

@Service
public class WaterScheduleServiceImpl implements WaterScheduleService  {
	
	@Resource
	private WaterScheduleRepository waterschedule_repository;
	
	@Override
	public WaterSchedule create(WaterSchedule waterschedule) {
		return waterschedule_repository.save(waterschedule);
	}

	@Override
	public WaterSchedule delete(Integer id) {
		WaterSchedule waterschedule = waterschedule_repository.findOne(id);
		if (waterschedule != null)
			waterschedule_repository.delete(waterschedule);

		return null;
	}

	@Override
	public List<WaterSchedule> findAll() {
			return waterschedule_repository.findAll();
	}

	@Override
	public WaterSchedule update(WaterSchedule waterschedule) {
		WaterSchedule update = waterschedule_repository.save(waterschedule);
		if (update != null)
			return update;

		return null;
	}
	@Transactional
	@Override
	public WaterSchedule findById(Integer id) {
		if (id != null)
			return waterschedule_repository.findOne(id);

		return null;
	}
}
