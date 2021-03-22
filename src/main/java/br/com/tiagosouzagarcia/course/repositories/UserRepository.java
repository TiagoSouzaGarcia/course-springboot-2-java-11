package br.com.tiagosouzagarcia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiagosouzagarcia.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
