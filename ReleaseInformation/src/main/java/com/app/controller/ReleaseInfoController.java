package com.app.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
@RequestMapping(value = "/getWarDetails")
public class ReleaseInfoController {
	@RequestMapping(value = "/Info",method = RequestMethod.GET)
	public String getReleaseInformation(){
		Runtime runTime=Runtime.getRuntime();
		long maxMemory = runTime.maxMemory();
		System.out.println(runTime.totalMemory());
		System.out.println(runTime.freeMemory());
		System.out.println(runTime.totalMemory()-runTime.freeMemory());
		
		ModelAndView model=new ModelAndView();
		List<String> listWar = null;
		File directory = new File("C://");
		File[] filesInfo = directory.listFiles();
		if (filesInfo.length > 0) {
			listWar = new ArrayList<String>();
			for (File file : filesInfo) {
				boolean war = file.getName().endsWith(".zip");
				if (war == true) {
					listWar.add( file.getName());
				}
			}
		}
		
		model.addObject("list",listWar);
	return "warInfo";
	}
}