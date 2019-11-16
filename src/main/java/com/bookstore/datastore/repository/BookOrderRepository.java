package com.bookstore.datastore.repository;

import com.bookstore.datastore.entity.BookOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookOrderRepository extends JpaRepository<BookOrder,Integer> {
}
