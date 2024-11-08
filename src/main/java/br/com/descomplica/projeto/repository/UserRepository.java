package br.com.descomplica.projeto.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.descomplica.projeto.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	Optional<User> findByUserEmail(String email);
}
