package br.com.consultorionutricionalapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.consultorionutricionalapi.UserRepository;
import br.com.consultorionutricionalapi.model.User;
import br.com.consultorionutricionalapi.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository repository;

	@Override
	public User save(User user) {
		return repository.save(user);
	}

}
