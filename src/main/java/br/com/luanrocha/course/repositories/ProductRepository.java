package br.com.luanrocha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luanrocha.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
