package br.com.lea3.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lea3.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
