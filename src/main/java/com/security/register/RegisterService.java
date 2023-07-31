package com.security.register;

import org.springframework.stereotype.Service;


@Service
public interface RegisterService {
	
	String addRegistration(RegisterDTO registerDTO);


}
