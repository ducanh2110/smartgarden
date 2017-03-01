package com.example.serviceImpl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.stereotype.Service;

import com.example.model.Device;
import com.example.repository.DeviceRepository;
import com.example.service.DeviceService;

@Service
public class DeviceServiceImpl implements DeviceService {

	@Resource
	private DeviceRepository repository;

	@Override
	public Device create(Device device) {
	
		return repository.save(device);
	}

	@Override
	public Device delete(Integer id) {
		Device device = repository.findOne(id);
		if (device != null)
			repository.delete(device);

		return null;
	}

	@Override
	public List<Device> findAll() {
		return repository.findAll();
	}

	@Override
	public Device update(Device device) {
		return repository.save(device);
	}

	@Override
	public Device findById(Integer id) {
		if (id != null)
			return repository.findOne(id);

		return null;
	}

}
