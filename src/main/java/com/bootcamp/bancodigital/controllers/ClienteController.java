package com.bootcamp.bancodigital.controllers;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.bancodigital.entities.Cliente;
import com.bootcamp.bancodigital.services.ClienteService;

@RestController
@RequestMapping("/proposta/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@PostMapping
	@ExceptionHandler
	public ResponseEntity<Set<String>> adicionarCliente(@RequestBody @Valid Cliente cliente) {
		try {
			clienteService.adicionarCliente(cliente);
			URI uri = new URI("/proposta/cliente/endereco");
			return new ResponseEntity<>(new HashSet<>(0), HttpStatus.CREATED);
			
			  } catch (ConstraintViolationException ex) { Set<ConstraintViolation<?>>
			  violations = ex.getConstraintViolations(); Set<String> messages = new
			  HashSet<>(violations.size()); messages.addAll(violations.stream()
			  .map(constraintViolation -> String.format("%s value '%s' %s",
			 constraintViolation.getPropertyPath(), constraintViolation.getInvalidValue(),
			  constraintViolation.getMessage())) .collect(Collectors.toList())); return new
			  ResponseEntity<>(messages, HttpStatus.BAD_REQUEST);
			 

		} catch (Exception ex2) {
			Set<String> messages = new HashSet<>(1);
			messages.add(ex2.getMessage());
			return new ResponseEntity<>(messages, HttpStatus.BAD_REQUEST);
		}

	}

	@PutMapping("/{id}")
	public ResponseEntity<String> atualizarCliente(@RequestBody @Valid Cliente cliente) {
		try {
			clienteService.atualizarCliente(cliente);
			URI uri = new URI("/proposta/cliente/endereco");
			return ResponseEntity.created(uri).body("");
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());

		}

	}

}
