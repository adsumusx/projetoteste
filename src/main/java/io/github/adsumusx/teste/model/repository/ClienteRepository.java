package io.github.adsumusx.teste.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.adsumusx.teste.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
