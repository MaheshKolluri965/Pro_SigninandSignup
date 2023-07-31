package com.security.register;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
1. POJO is a generic Java class that represents data and behavior, following simple Java conventions.
2. Entity class is a special type of POJO used in JPA/Hibernate to represent 
	persistent data entities mapped to database tables.
3. DTO is a design pattern used to transfer data between application layers 
	or boundaries, acting as lightweight data containers. 
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class RegisterDTO {
	
	private int registerId;
	
	private String email;
	
	private String registerName;
	
	
	private String password;

}
