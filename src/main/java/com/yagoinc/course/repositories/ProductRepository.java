package com.yagoinc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagoinc.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
