package br.com.senai.api_clinica_veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.api_clinica_veterinaria.entity.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
    
}
