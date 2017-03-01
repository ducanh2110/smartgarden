package com.example.service;

import java.util.List;

import com.example.model.Device;

public interface DeviceService {
	public Device create(Device device);

	public Device delete(Integer id);

	public List<Device> findAll();

	public Device update(Device device);

	public Device findById(Integer id);

}
