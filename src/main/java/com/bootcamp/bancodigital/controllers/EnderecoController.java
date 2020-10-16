package com.bootcamp.bancodigital.controllers;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.bancodigital.entities.Endereco;
import com.bootcamp.bancodigital.services.EnderecoService;

@RestController
@RequestMapping (value = "/proposta/cliente/endereco")
public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;
	
	@PostMapping
	public ResponseEntity<String>  adicionarEndereco(@RequestBody @Valid Endereco endereco) {
		try {
			enderecoService.adicionarEndereco(endereco);
			URI uri = new URI("/proposta/cliente/arquivo-cpf"); 
			return ResponseEntity.created(uri).body("");
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
			
		}
		
	}
	
	
	
	@PutMapping("/{id}")
	public ResponseEntity<String> atualizarEndereco(@RequestBody @Valid Endereco endereco) {
		try {
			enderecoService.atualizarEndereco(endereco);
			URI uri = new URI("/proposta/cliente/arquivo-cpf"); 
			return ResponseEntity.created(uri).body("");
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
			
		}
		
	}
	
}
