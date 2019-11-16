package com.bookstore.datastore.repository;

import com.bookstore.datastore.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {
}
