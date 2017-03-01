package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.HoaLy;
import com.example.service.HoaLyService;

@Controller
@RequestMapping("/hoaly")
public class HoaLyController {
	@Autowired
	private HoaLyService hoalyService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String test(@ModelAttribute HoaLy hoaly) {
		hoalyService.create(hoaly);
		return "index";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("hoaly", new HoaLy());
		return mav;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody HoaLy listHoa() {
		HoaLy hoaLy = null;
		List<HoaLy> list = new ArrayList<HoaLy>();

		hoaLy = hoalyService.findById(3);
		return hoaLy;
	}
}
