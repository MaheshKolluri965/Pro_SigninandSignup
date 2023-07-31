package com.security.register;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Configuration
@Service
public class RegisterServiceImpl implements RegisterService{
	
	// The Record is Coming from DTO and set it into the Entity and then call the Entity from Repo method.
	
	@Autowired
	private RegisterRepo registerRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String addRegistration(RegisterDTO registerDTO) {
		
		 if (registerDTO.getPassword() == null || registerDTO.getPassword().isEmpty()) {
	            throw new IllegalArgumentException("Password cannot be null or empty");
	        }
	
		RegisterEntity registerEntity = new RegisterEntity(
				registerDTO.getEmail(),
				registerDTO.getRegisterId(),
				registerDTO.getRegisterName(), 
				this.passwordEncoder.encode(registerDTO.getPassword())			
		);
		
		registerRepo.save(registerEntity);		
		return registerEntity.getRegisterName();
	}

	
}
