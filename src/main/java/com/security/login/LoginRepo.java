package com.security.login;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.security.register.RegisterEntity;

@EnableJpaRepositories
@Repository
public interface LoginRepo extends JpaRepository<RegisterEntity, Integer> {

	RegisterEntity findByEmail(String string);

	Optional<RegisterEntity> findOneByEmailAndPassword(String email, String encodedPassword);

}

