package br.com.descomplica.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.descomplica.projeto.entity.User;
import br.com.descomplica.projeto.repository.UserRepository;

@Service
public class UserService {
	@Autowired
    UserRepository userRepository;

    public User findByEmail(String email){
        return userRepository.findByUserEmail(email).get();
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
