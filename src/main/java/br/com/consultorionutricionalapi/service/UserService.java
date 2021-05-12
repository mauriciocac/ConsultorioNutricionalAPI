package br.com.consultorionutricionalapi.service;

import java.util.Optional;

import br.com.consultorionutricionalapi.model.User;

public interface UserService {
	User save(User user);

	Optional<User> findById(Long id);
}
