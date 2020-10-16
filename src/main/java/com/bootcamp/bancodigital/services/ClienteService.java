package com.bootcamp.bancodigital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.bancodigital.entities.Cliente;
import com.bootcamp.bancodigital.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public void adicionarCliente(Cliente cliente) {
		clienteRepository.save(cliente);
		
	}

	public void atualizarCliente(Cliente cliente) {
		clienteRepository.save(cliente);
		
	}

}
