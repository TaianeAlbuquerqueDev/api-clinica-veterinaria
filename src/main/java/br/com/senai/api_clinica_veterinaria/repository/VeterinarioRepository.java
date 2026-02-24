package br.com.senai.api_clinica_veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.api_clinica_veterinaria.entity.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario,Long> {
    
}
