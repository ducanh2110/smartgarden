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

import com.example.model.Water;
import com.example.service.WaterService;
@RestController
@RequestMapping("/water")
public class WaterController {
	
	@Autowired
	private WaterService waterService;
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createPage() {
		return new ModelAndView("create-water");
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView create(@ModelAttribute Water water) {
		waterService.create(water);
		return new ModelAndView("redirect:/water/list");
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView showWater(@PathVariable(value = "id", required = true) Integer id) {
		Water water = waterService.findById(id);
		return new ModelAndView("water", "water", water);
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listWaters() {
		List<Water> listWaters = waterService.findAll();
		return new ModelAndView("list-waters", "waters", listWaters);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public String updateWater(@RequestParam(value = "status", required=false) Boolean status,
		 @PathVariable("id") Integer id) {
		System.out.println("status: " + status);
		Water water = waterService.findById(id);
		if (status != null)
			water.setWater_status(status);
		
		
		try {
			waterService.update(water);
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
	public Water showDeviceJson(@PathVariable(value = "id", required = true) Integer id) {
		Water water = waterService.findById(id);
		
		return water;
	}
}
