package com.salvador.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salvador.course.entities.OrderItem;
import com.salvador.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
