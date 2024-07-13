package com.nt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataRenderingOperationController {
	
	
	@GetMapping("/os")
	public String sendData(Map<String, Object> map) {
		
		map.put("name", System.getProperty("os.name"));
		map.put("version", System.getProperty("os.version"));
		
		return "show_data";
	}
	
	@GetMapping("/data")
	public String sendDataArray(Map<String, Object> map) {
		
		
		map.put("os_nammes",new String[] {"windows","MAC","Ubuntu"});
		
			
		return "show_data";
	}
	
	
}
