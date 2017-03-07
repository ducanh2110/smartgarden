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

import com.example.model.Fan;
import com.example.service.FanService;
@RestController
@RequestMapping("/fan")
public class FanController {
	
	@Autowired
	private FanService fanService;
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createPage() {
		return new ModelAndView("create-fan");
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView create(@ModelAttribute Fan fan) {
		fanService.create(fan);
		return new ModelAndView("redirect:/fan/list");
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView showFan(@PathVariable(value = "id", required = true) Integer id) {
		Fan fan = fanService.findById(id);
		return new ModelAndView("fan", "fan", fan);
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listFans() {
		List<Fan> listFans = fanService.findAll();
		return new ModelAndView("list-fans", "fans", listFans);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public String updateFan(@RequestParam(value = "status", required=false) Boolean status,
		 @PathVariable("id") Integer id) {
		System.out.println("status: " + status);
		Fan fan = fanService.findById(id);
		if (status != null)
			fan.setFan_status(status);
		
		
		try {
			fanService.update(fan);
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
	public Fan showDeviceJson(@PathVariable(value = "id", required = true) Integer id) {
		Fan fan = fanService.findById(id);
		
		return fan;
	}
}
