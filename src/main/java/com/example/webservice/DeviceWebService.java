package com.example.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Device;
import com.example.service.DeviceService;

@RestController
@RequestMapping("/service/device")
public class DeviceWebService {
	@Autowired
	private DeviceService deviceService;
	
	@ResponseBody
	@RequestMapping("/list")
	private List<Device> turnLight() {
		return deviceService.findAll();
	}
}
