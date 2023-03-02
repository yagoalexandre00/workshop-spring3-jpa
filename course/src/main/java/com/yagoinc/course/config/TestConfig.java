package com.yagoinc.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.yagoinc.course.entities.Category;
import com.yagoinc.course.entities.Order;
import com.yagoinc.course.entities.Product;
import com.yagoinc.course.entities.User;
import com.yagoinc.course.entities.enums.OrderStatus;
import com.yagoinc.course.repositories.CategoryRepository;
import com.yagoinc.course.repositories.OrderRepository;
import com.yagoinc.course.repositories.ProductRepository;
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

	@Autowired
	private ProductRepository productRepository;

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

		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4));
		categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
	}
}
