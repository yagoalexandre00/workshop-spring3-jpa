package com.yagoinc.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.yagoinc.course.entities.User;
import com.yagoinc.course.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Yago Alexandre", "yago@mail", "988888888", "123456");
		User u2 = new User(null, "Cayo Cutrim", "cayo@mail", "977777777", "123456");
		User u3 = new User(null, "Thiago Gonzalez", "thiago@mail", "977777777", "123456");
		User u4 = new User(null, "Ciro Dourado", "ciro@mail", "977777777", "123456");

		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
	}

}
