package br.com.senai.api_clinica_veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.api_clinica_veterinaria.entity.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long>{
    
}
