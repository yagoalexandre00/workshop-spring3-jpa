package com.yagoinc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagoinc.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
