
@RestController
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    //GET /categorias
    @GetMapping("/categorias") //hacer el mapping
    public ResponseEntity<List<Categoria>> traerCategorias (){ //return Response Entity
        return ResponseEntity.ok(service.traerCategorias()); //return entity con el valor esperado
    }

    

}
