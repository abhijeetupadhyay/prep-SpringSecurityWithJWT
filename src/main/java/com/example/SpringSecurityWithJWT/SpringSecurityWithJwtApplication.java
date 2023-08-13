package com.example.SpringSecurityWithJWT;

import com.example.SpringSecurityWithJWT.entity.User;
import com.example.SpringSecurityWithJWT.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityWithJwtApplication {

	@Autowired
	private UserRepository userRepository;
	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(
				new User(101, "abhinav", "pass", "abc1@gmail.com"),
				new User(102, "ankit", "pass", "abc2@gmail.com"),
				new User(103, "amit", "pass", "abc3@gmail.com"),
				new User(104, "amrit", "pass", "abc4@gmail.com")
				).collect(Collectors.toList());
		userRepository.saveAll(users);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityWithJwtApplication.class, args);
	}

}
