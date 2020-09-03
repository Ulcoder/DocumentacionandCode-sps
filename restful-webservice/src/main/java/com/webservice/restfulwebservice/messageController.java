package com.webservice.restfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class messageController {

	
	@GetMapping(path="/api/sps/helloworld/v1/{newmessage}")
	public Test messageTest(@PathVariable String newmessage) {
		return new Test(String.format("Message and %s", newmessage));
	}
	
}
