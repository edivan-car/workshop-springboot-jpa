package br.com.lea3.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lea3.course.entities.OrderItem;
import br.com.lea3.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
