package br.com.senai.api_clinica_veterinaria.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;

@Entity
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull(message = "É necessário informar a data e a hora da consulta! (ex.: 2026/02/10 11:00:00)") 
    private LocalDateTime dataHora;

    //precisei passar essa anotação, pois a tabela interemediaria tinha um atibuto, aí preciso criar uma e referenciar aqui e many to many lá
    @OneToMany(mappedBy = "consulta")
    private List<VeterinarioConsulta> veterinarioConsultas;

    @ManyToOne
    @JoinColumn(name = "fk_animal")
    private Animal animal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public List<VeterinarioConsulta> getVeterinarioConsultas() {
        return veterinarioConsultas;
    }

    public void setVeterinarioConsultas(List<VeterinarioConsulta> veterinarioConsultas) {
        this.veterinarioConsultas = veterinarioConsultas;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

   
}
