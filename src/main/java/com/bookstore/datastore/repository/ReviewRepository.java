package com.bookstore.datastore.repository;

import com.bookstore.datastore.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Integer> {
}
