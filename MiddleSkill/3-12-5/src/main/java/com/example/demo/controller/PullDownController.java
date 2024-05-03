package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/map")
@Controller
public class PullDownController {

	@GetMapping
	public ModelAndView position(ModelAndView position) {

		Map<String,String>positionPull=new HashMap<String,String>(){
			{
				put("社員A","経営企画");
				put("社員B","財務");
				put("社員C","経理");
				put("社員D","人事");
				put("社員E","総務");
				put("社員F","法務");
				put("社員G","広報");
				put("社員H","情報システム");

			}
		};
		position.addObject("map",positionPull);
		position.setViewName("map");
		return position;

	}

}
