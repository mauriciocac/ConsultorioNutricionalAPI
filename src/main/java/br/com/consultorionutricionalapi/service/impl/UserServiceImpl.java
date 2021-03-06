package br.com.consultorionutricionalapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.consultorionutricionalapi.model.User;
import br.com.consultorionutricionalapi.repository.UserRepository;
import br.com.consultorionutricionalapi.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository repository;

	@Override
	public User save(User user) {
		return repository.save(user);
	}

	@Override
	public Optional<User> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<User> litAll() {
		return repository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public User update(User user) {
		return repository.save(user);
	}

}
