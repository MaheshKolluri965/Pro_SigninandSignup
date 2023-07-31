package com.security.login;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.register.RegisterEntity;

@Configuration
@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginRepo loginRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@Override
	public LoginResponse loginUser(LoginDTO loginDTO) {
		
		RegisterEntity registerEntity = loginRepo.findByEmail(loginDTO.getEmail());
		if(registerEntity != null) {
			String password = loginDTO.getPassword();
			String encodedPassword = registerEntity.getPassword();
			Boolean isPwdRight = passwordEncoder.matches(password,  encodedPassword);
			
			if(isPwdRight) {
				Optional<RegisterEntity> register = loginRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
				if(register.isPresent()) {
					return new LoginResponse("Login Success", true);
				}
				else {
					return new LoginResponse("Login Failed", false);
					
				}
			}else {
				return new LoginResponse("password Not Match", false);
			}
			
		}else {
			return new LoginResponse("Email not exists", false);
		}
		
	}


	


}
