package br.com.senai.api_clinica_veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.api_clinica_veterinaria.entity.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
