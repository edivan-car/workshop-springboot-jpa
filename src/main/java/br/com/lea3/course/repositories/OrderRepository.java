package br.com.lea3.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lea3.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
