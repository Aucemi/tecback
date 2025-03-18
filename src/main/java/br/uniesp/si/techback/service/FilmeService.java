package br.uniesp.si.techback.service;

import br.uniesp.si.techback.model.Filme;
import br.uniesp.si.techback.repository.FilmeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;
    public Filme cadastrar(Filme filme){
        return repository.save(filme);
    }

    public Filme alterar(Filme filme){
        if(filme.getId()==null){
            throw new EntityNotFoundException();
        }
        return repository.save(filme);
    }

    public List<Filme> listar(){
        return repository.findAll();
    }

    public void excluir(Integer id){
        repository.deleteById(id);
    }

}
