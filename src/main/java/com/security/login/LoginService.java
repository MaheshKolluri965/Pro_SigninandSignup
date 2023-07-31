package com.security.login;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {

	LoginResponse loginUser(LoginDTO loginDTO);

}
