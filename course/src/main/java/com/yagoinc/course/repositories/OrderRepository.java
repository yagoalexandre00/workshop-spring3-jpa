package com.yagoinc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagoinc.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
