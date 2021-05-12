package br.com.consultorionutricionalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.consultorionutricionalapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
