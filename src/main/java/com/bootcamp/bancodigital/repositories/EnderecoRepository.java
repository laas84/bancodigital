package com.bootcamp.bancodigital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.bancodigital.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
