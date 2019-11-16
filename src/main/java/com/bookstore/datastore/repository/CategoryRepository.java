package com.bookstore.datastore.repository;

import com.bookstore.datastore.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
