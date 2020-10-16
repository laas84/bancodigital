package com.bootcamp.bancodigital.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.bancodigital.entities.ArquivoCpf;
import com.bootcamp.bancodigital.services.ArquivoCpfService;

@RestController
@RequestMapping (value = "/proposta/cliente/arquivo-cpf")
public class ArquivoCpfController {

	@Autowired
	private ArquivoCpfService arquivoCpfService;
	
	@PostMapping
	public void adicionarArquivo(@RequestBody @Valid ArquivoCpf arquivoCpf) {
		arquivoCpfService.adicionarArquivo(arquivoCpf);
	}
	
	@PutMapping("/{id}")
	public void atualizarArquivo (@RequestBody @Valid ArquivoCpf arquivoCpf) {
		arquivoCpfService.atualizarArquivo(arquivoCpf);
	}
	
}
