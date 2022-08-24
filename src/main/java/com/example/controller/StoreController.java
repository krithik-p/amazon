package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Books;
import com.example.model.Devices;

@Controller
public class StoreController {
	
	Devices dList;
	Books bList;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/samsung")
	public ModelAndView samsung() {
		ModelAndView mv = new ModelAndView("samsung");
		/*
		 * Device d1 = new Device("Samsung Galaxy 10","Smart Phone"); Device d2 = new
		 * Device("Samsung Note 11","Smart Note"); Device d3 = new
		 * Device("Samsung Tab A","Smart Tab");
		 * 
		 * List<Device> sList = new ArrayList<Device>(); sList.add(d1); sList.add(d2);
		 * sList.add(d3);
		 * 
		 * Devices dList = new Devices(sList, "Samsung");
		 */
		RestTemplate rt = new RestTemplate();
		dList = rt.getForObject("http://localhost:8085/samsung/devices", Devices.class);
		mv.addObject("devices", dList);
				
		return mv;
	}
	
	@RequestMapping("/apple")
	public ModelAndView apple() {
		ModelAndView mv = new ModelAndView("apple");
		RestTemplate rt = new RestTemplate();
		dList = rt.getForObject("http://localhost:8084/apple/devices", Devices.class);
		mv.addObject("devices", dList);
		
		return mv;
	}
	
	@RequestMapping("/oneplus")
	public ModelAndView oneplus() {
		ModelAndView mv = new ModelAndView("oneplus");
		return mv;
	}
	
	@RequestMapping("/book")
	public ModelAndView books() {
		
		ModelAndView mv = new ModelAndView("book");
		RestTemplate rt = new RestTemplate();
		bList = rt.getForObject("http://localhost:8086/book", Books.class);
		mv.addObject("book", bList);
		return mv;
	}
	
	@RequestMapping("/dummy")
	public String dummy() {
		return "dummy";
	}
	
	

}