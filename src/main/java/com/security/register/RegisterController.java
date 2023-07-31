package com.security.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController //for Restful api implementation
@RequestMapping("/rest/api")		// RestAPI path
@CrossOrigin("http://localhost:4200")   // For front and backend connection

public class RegisterController {
	
	@Autowired
	public RegisterService registerService;
	
	@PostMapping(path="/register")
	public String saveRegistration(@RequestBody RegisterDTO registerDTO) {
		String id = registerService.addRegistration(registerDTO);
		return id;
	}
	

}
