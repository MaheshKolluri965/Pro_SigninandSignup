package com.security.register;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name="Registration")		//Table Name
public class RegisterEntity {

	@Id
	@Column(name="email", length = 255)
	private String email;
	
	@Column(name="registerId", length = 45)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int registerId;
	
	@Column(name="registerName", length = 255)
	private String registerName;
	
	@Column(name="password", length = 255)
	private String password;	
	
}
