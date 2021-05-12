package br.com.consultorionutricionalapi.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User extends AbstractEntity<Long> {
	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	private String name;
	@Column(name = "cpf")
	private String cpf;
	@Column(name = "data_nascimento")
	private LocalDate dataNascimento;

	public User() {
	}

	public User(String name, String cpf, LocalDate dataNascimento) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
