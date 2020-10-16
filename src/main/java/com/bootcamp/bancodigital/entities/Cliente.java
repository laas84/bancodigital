package com.bootcamp.bancodigital.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.br.CPF;


@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotBlank(message="Esse campo deve ser preenchido")
	private String nome;
	
	@NotBlank(message="Esse campo deve ser preenchido")
	private String sobrenome;
	
	@NotBlank(message="Esse campo deve ser preenchido")
	@Past(message = "A data de nascimento deve estar no passado!")
	private LocalDate datanascimento;
	
	@NotBlank(message="Esse campo deve ser preenchido")
	@Email(message="Erro de e-mail")
	@Column(unique=true)
	private String email;
	
	@NotBlank(message="Esse campo deve ser preenchido")
	@CPF(message="Erro de cpf")
	@Column(unique=true)
	private String cpf;
	
	@OneToOne
	private Endereco endereco;
	
	@OneToOne
	private ArquivoCpf arquivocpf;
	
	public Cliente () {
		
	}
	
	public Cliente (Long id, String nome, String sobrenome, LocalDate datanascimento, String email, String cpf , Endereco endereco, ArquivoCpf arquivocpf) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome; 
		this.datanascimento = datanascimento;
		this.email = email;
		this.cpf = cpf;
		this.endereco = endereco;
		this.arquivocpf = arquivocpf;
	}

	
	
	public ArquivoCpf getArquivocpf() {
		return arquivocpf;
	}

	public void setArquivocpf(ArquivoCpf arquivocpf) {
		this.arquivocpf = arquivocpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public LocalDate getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(LocalDate datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
