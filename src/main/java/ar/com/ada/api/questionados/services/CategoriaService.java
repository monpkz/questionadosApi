package ar.com.ada.api.questionados.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.questionados.entities.Categoria;
import ar.com.ada.api.questionados.repos.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository repo;

    public List<Categoria> traerCategorias(){
        return repo.findAll();
    }

    public Categoria buscarCategoria(Integer categoriaId){

        Optional<Categoria> resultado = repo.findById(categoriaId);
        Categoria categoria = null;

        if (resultadi.isPresent())
            categoria = resultadoget();
        return categoria;
    }

    public boolean

}
