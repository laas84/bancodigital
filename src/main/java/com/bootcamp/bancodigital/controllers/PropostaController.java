package com.bootcamp.bancodigital.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.bancodigital.entities.Proposta;
import com.bootcamp.bancodigital.services.PropostaService;

@RestController
@RequestMapping (value = "/proposta")
public class PropostaController {
	
	@Autowired
	private PropostaService propostaService;
	
	@PostMapping
	public void  adicionarProposta(@RequestBody @Valid Proposta proposta) {
		propostaService.adicionarProposta(proposta);
	}
	
	@PutMapping("/{id}")
	public void atualizarProposta(@RequestBody @Valid Proposta proposta) {
		propostaService.atualizarProposta(proposta);
	}
}
