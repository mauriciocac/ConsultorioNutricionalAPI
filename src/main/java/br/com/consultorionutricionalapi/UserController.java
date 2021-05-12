package br.com.consultorionutricionalapi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.consultorionutricionalapi.model.User;
import br.com.consultorionutricionalapi.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<User> save(@RequestBody User user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(user));
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		Optional<User> optUser = service.findById(id);
		if (!optUser.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(optUser.get());
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		List<User> optUser = service.litAll();
		return ResponseEntity.status(HttpStatus.OK).body(optUser);
	}
}
