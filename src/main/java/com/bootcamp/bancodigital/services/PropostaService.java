package com.bootcamp.bancodigital.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.bancodigital.entities.Proposta;
import com.bootcamp.bancodigital.repositories.PropostaRepository;

@Service
public class PropostaService {

	@Autowired
	private PropostaRepository propostaRepository;
	
	public void adicionarProposta(@Valid Proposta proposta) {
		propostaRepository.save(proposta);		
	}

	public void atualizarProposta(@Valid Proposta proposta) {
		propostaRepository.save(proposta);		
	}

	
}
