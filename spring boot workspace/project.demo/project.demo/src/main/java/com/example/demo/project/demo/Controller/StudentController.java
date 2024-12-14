package com.example.demo.project.demo.Controller;

//import java.util.HashMap;
//import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Map<Integer, String> givestudent() {

		Map<Integer, String> map = new HashMap();
		map.put(01, "ajay");
		map.put(02, "rakesh");
		map.put(03, "prathmesh");

		return map;

	}

}
