package br.com.luanrocha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luanrocha.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
