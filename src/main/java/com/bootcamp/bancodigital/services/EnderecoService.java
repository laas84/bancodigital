package com.bootcamp.bancodigital.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.bancodigital.entities.Endereco;
import com.bootcamp.bancodigital.repositories.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	public void adicionarEndereco(Endereco endereco) {
		enderecoRepository.save(endereco);
		
	}

	public void atualizarEndereco(@Valid Endereco endereco) {
		enderecoRepository.save(endereco);
		
	}

	
	
}
