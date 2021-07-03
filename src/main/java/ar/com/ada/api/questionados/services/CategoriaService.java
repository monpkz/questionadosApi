package ar.com.ada.api.questionados.service;


public class CategoriaService {

    @Autowired
    CategoriaRepository repo;

    public List<Categoria> traerCategorias(){
        return repo.findAll();
    }
}
