package br.com.luanrocha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luanrocha.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
