package br.com.senai.api_clinica_veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.api_clinica_veterinaria.entity.Animal;
import br.com.senai.api_clinica_veterinaria.exception.Response;
import br.com.senai.api_clinica_veterinaria.repository.AnimalRepository;

@RestController
@RequestMapping("/animais")
public class AnimalController {
    
    @Autowired
    private AnimalRepository repository;

    @PostMapping
    public Response cadastrarAnimal(@RequestBody Animal animal) {
        repository.save(animal);
        return new Response(201, "Animal cadastrado com sucesso!");
    }

    @GetMapping
    public List<Animal> getAllAnimals(){
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public Response atualizarAnimal(@PathVariable Long id, @RequestBody Animal novo) {
        if (!repository.existsById(id)) {
            return new Response(404, "Animal não encontrado!");
        }

        Animal animal = repository.findById(id).get();

        if (novo.getEspecie() != null) {
            animal.setEspecie(novo.getEspecie());
        }

        if (novo.getIdade() != null) {
            animal.setIdade(novo.getIdade());
        }

        if (novo.getInfosMedicas() != null) {
            animal.setInfosMedicas(novo.getInfosMedicas());
        }

        if (novo.getNome() != null) {
            animal.setNome(novo.getNome());
        }

        if (novo.getRaca() != null) {
            animal.setRaca(novo.getRaca());
        }

        if (novo.getStatus() != null) {
            animal.setStatus(novo.getStatus());
        }

        repository.save(animal);

        return new Response(200, "Animal atualizado com sucesso!");
    }

    @DeleteMapping("/{id}")
    public Response deletarAnimal(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return new Response(404, "Animal não encontrado!");
        }
        repository.deleteById(id);
        return new Response(204, "Animal deletado com sucesso!");
    }
}
