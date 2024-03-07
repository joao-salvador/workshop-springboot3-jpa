package com.salvador.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salvador.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
