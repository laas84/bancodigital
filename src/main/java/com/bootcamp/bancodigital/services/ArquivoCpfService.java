package com.bootcamp.bancodigital.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.bancodigital.entities.ArquivoCpf;
import com.bootcamp.bancodigital.repositories.ArquivoCpfRepository;

@Service
public class ArquivoCpfService {

	@Autowired
	private ArquivoCpfRepository arquivoCpfRepository;

	public void adicionarArquivo(ArquivoCpf arquivoCpf) {
		arquivoCpfRepository.save(arquivoCpf);
		
	}

	public void atualizarArquivo(ArquivoCpf arquivoCpf) {
		arquivoCpfRepository.save(arquivoCpf);
		
	}
	
	
}
