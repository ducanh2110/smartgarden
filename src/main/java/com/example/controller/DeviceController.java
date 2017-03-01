package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Device;
import com.example.model.Fan;
import com.example.model.HoaLy;
import com.example.model.Led;
import com.example.model.Nutrient;
import com.example.model.Water;
import com.example.service.DeviceService;
import com.example.service.FanService;
import com.example.service.HoaLyService;
import com.example.service.LedService;
import com.example.service.NutrientService;
import com.example.service.WaterService;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
@RequestMapping("/device")
public class DeviceController {
	@Autowired
	private DeviceService deviceService;
	@Autowired
	private FanService fanService;
	@Autowired
	private LedService ledService;
	@Autowired
	private NutrientService nutrientService;
	@Autowired
	private WaterService waterService;

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createPage() {
		return new ModelAndView("create-device");
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView create(@ModelAttribute Device device) {
		deviceService.create(device);
		return new ModelAndView("create-device");
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView showDevice(@PathVariable(value = "id", required = true) Integer id) {
		Device device = deviceService.findById(id);
		return new ModelAndView("device", "device", device);
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listDevices() {
		List<Device> listDevices = deviceService.findAll();
		return new ModelAndView("list-devices", "devices", listDevices);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public String updateDevice(@RequestParam(value = "light", required=false) Boolean turnLight,
			@RequestParam(value = "brightness", required=false) Integer brightness, @PathVariable("id") Integer id) {
		System.out.println("light: " + turnLight + " || brightness: " + brightness);
		Device device = deviceService.findById(id);
		if (turnLight != null)
			device.setTurnLight(turnLight);
		if (brightness != null)
			device.setBrightness(brightness);
		
		try {
			deviceService.update(device);
			return "success";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("greeting");
		return mav;
	}
	
	@RequestMapping(value = "/{id}/json", method = RequestMethod.GET)
	public Device showDeviceJson(@PathVariable(value = "id", required = true) Integer id) {
		Device device = deviceService.findById(id);
		
		return device;
	}
	@RequestMapping(value = "/json", method = RequestMethod.GET)
	public List<Object> showDeviceListJson() {
		List<Object> listBoth = new ArrayList<Object>();
		List<Device> device = deviceService.findAll();
		List<Led> led = ledService.findAll();
		List<Water> water = waterService.findAll();
		List<Nutrient> nutrient = nutrientService.findAll();
		
		List<Fan> fan = fanService.findAll();

	//	listBoth.addAll(hoaly);
		listBoth.addAll(led);
		listBoth.addAll(water);
		listBoth.addAll(nutrient);
		listBoth.addAll(fan);
		return listBoth;
		
		
	}
}
