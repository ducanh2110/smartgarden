package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Led;
import com.example.service.LedService;
@RestController
@RequestMapping("/led")
public class LedController {
	
	@Autowired
	private LedService ledService;
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createPage() {
		return new ModelAndView("create-led");
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView create(@ModelAttribute Led led) {
		ledService.create(led);
		
		List<Led> listLeds = ledService.findAll();
		return new ModelAndView("list-leds", "leds", listLeds);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView showLed(@PathVariable(value = "id", required = true) Integer id) {
		Led led = ledService.findById(id);
		return new ModelAndView("led", "led", led);
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listLeds() {
		List<Led> listLeds = ledService.findAll();
		return new ModelAndView("list-leds", "leds", listLeds);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public String updateLed(@RequestParam(value = "status", required=false) Boolean status,
		 @PathVariable("id") Integer id) {
		System.out.println("status: " + status);
		Led led = ledService.findById(id);
		if (status != null)
			led.setLed_status(status);
		
		
		try {
			ledService.update(led);
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
	public Led showDeviceJson(@PathVariable(value = "id", required = true) Integer id) {
		Led led = ledService.findById(id);
		
		return led;
	}
}
