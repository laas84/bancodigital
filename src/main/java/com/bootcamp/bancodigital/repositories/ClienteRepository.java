package com.bootcamp.bancodigital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.bancodigital.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
