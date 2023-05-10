package com.yagoinc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagoinc.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
