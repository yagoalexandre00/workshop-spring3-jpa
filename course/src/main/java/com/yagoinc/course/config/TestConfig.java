package com.yagoinc.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.yagoinc.course.entities.Category;
import com.yagoinc.course.entities.Order;
import com.yagoinc.course.entities.User;
import com.yagoinc.course.entities.enums.OrderStatus;
import com.yagoinc.course.repositories.CategoryRepository;
import com.yagoinc.course.repositories.OrderRepository;
import com.yagoinc.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Yago Alexandre", "yago@mail", "988888888", "123456");
		User u2 = new User(null, "Cayo Cutrim", "cayo@mail", "977777777", "123456");
		User u3 = new User(null, "Thiago Gonzalez", "thiago@mail", "977777777", "123456");
		User u4 = new User(null, "Ciro Dourado", "ciro@mail", "977777777", "123456");

		Order o1 = new Order(null, Instant.parse("2022-02-15T18:35:24.00Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2022-08-26T18:35:24.00Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2022-08-26T18:35:24.00Z"), OrderStatus.SHIPPED, u4);
		Order o4 = new Order(null, Instant.parse("2022-08-26T18:35:24.00Z"), OrderStatus.DELIVERED, u1);

		Category c1 = new Category(null, "Marketing");
		Category c2 = new Category(null, "Sales");
		Category c3 = new Category(null, "IT");

		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4));
		categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
	}
}
