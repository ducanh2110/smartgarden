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


import com.example.model.Nutrient;

import com.example.service.NutrientService;
@RestController
@RequestMapping("/nutrient")
public class NutrientController {
	
	@Autowired
	private NutrientService nutrientService;
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createPage() {
		return new ModelAndView("create-nutrient");
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView create(@ModelAttribute Nutrient nutrient) {
		nutrientService.create(nutrient);
		return new ModelAndView("redirect:/nutrient/list");
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView showNutrient(@PathVariable(value = "id", required = true) Integer id) {
		Nutrient nutrient = nutrientService.findById(id);
		return new ModelAndView("nutrient", "nutrient", nutrient);
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listNutrients() {
		List<Nutrient> listNutrients = nutrientService.findAll();
		return new ModelAndView("list-nutrients", "nutrients", listNutrients);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public String updateNutrient(@RequestParam(value = "status", required=false) Boolean status,
		 @PathVariable("id") Integer id) {
		System.out.println("status: " + status);
		Nutrient nutrient = nutrientService.findById(id);
		if (status != null)
			nutrient.setNutrient_status(status);
		
		
		try {
			nutrientService.update(nutrient);
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
	public Nutrient showDeviceJson(@PathVariable(value = "id", required = true) Integer id) {
		Nutrient nutrient = nutrientService.findById(id);
		
		return nutrient;
	}
	@RequestMapping(value="/delete/{id}")
    public ModelAndView delete(@PathVariable Integer id) {
	nutrientService.delete(id);
        return new ModelAndView("redirect:/nutrient/list");
    }
}
