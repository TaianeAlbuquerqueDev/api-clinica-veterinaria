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

import br.com.senai.api_clinica_veterinaria.entity.Dono;
import br.com.senai.api_clinica_veterinaria.exception.Response;
import br.com.senai.api_clinica_veterinaria.repository.DonoRepository;

@RestController
@RequestMapping("/donos")
public class DonoController {
    @Autowired
    private DonoRepository repository;

    @PostMapping
    public Response cadastrarDono(@RequestBody Dono dono) {
        repository.save(dono);
        return new Response(201, "Dono(a) cadastrado(a) com sucesso!");
    }

    @GetMapping
    public List<Dono> getAllDonos() {
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public Response atualizarConsulta(@PathVariable Long id, @RequestBody Dono novo) {
        if (!repository.existsById(id)) {
            return new Response(404, "Dono(a) não encontrado(a)!");
        }

        Dono dono = repository.findById(id).get();

        if (novo.getNome() != null) {
            dono.setNome(novo.getNome());
        }
        if (novo.getCpf() != null) {
            dono.setCpf(novo.getNome());
        }
        if (novo.getStatus() != null) {
            dono.setStatus(novo.getStatus());
        }

        repository.save(dono);

        return new Response(200, "Dono(a) atualizado(a) com sucesso!");
    }

    @DeleteMapping("/{id}")
    public Response deletarConsulta(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return new Response(404, "Dono(a) não encontrado(a)!");
        }
        repository.deleteById(id);
        return new Response(204, "Dono(a) deletado(a) com sucesso!");
    }
}
