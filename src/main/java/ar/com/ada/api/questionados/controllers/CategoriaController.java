package ar.com.ada.api.questionados.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ar.com.ada.api.questionados.services.CategoriaService;
import ar.com.ada.api.questionados.entities.Categoria;
import ar.com.ada.api.questionados.models.request.CategoriaNuevaInfo;
import ar.com.ada.api.questionados.models.response.GenericResponse;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    //GET /categorias
    @GetMapping("/categorias") //hacer el mapping
    public ResponseEntity<List<Categoria>> traerCategorias (){ //return Response Entity
        
        return ResponseEntity.ok(service.traerCategorias()); //return entity con el valor esperado
    }

    //GET categoria por Id
    @GetMapping("/categorias/{id}")
    public ResponseEntity<Categoria> traerCategoriaPorId(@PathVariable Integer id){
        
        return ResponseEntity.ok(service.buscarCategoria(id));
    }
    
    @PostMapping(value = "/categorias")
    public ResponseEntity<?> crearCategoria(@RequestBody Categoria categoria) {
        GenericResponse r = new GenericResponse();

        if (service.crearCategoria(categoria)) {
            r.id = categoria.getCategoriaId();
            r.isOk = true;
            r.message = "Categoria creada con exito";
            
            return ResponseEntity.ok(r);

        } else {
            r.isOk = false;
            r.message = "Esta categoria ya existe.";

            return ResponseEntity.badRequest().body(r);
        }
    }

    @PutMapping("/categorias/{id}") //actualiza una categoria existente
    public ResponseEntity<GenericResponse> actualizar (@PathVariable Integer id, @RequestBody CategoriaNuevaInfo categoriaNuevaInfo){
    
        service.actualizar(id, categoriaNuevaInfo);
        GenericResponse respuesta = new GenericResponse();

        respuesta.isOk = true;
        respuesta.message = "Categoria actualizada";

        return ResponseEntity.ok(respuesta);

    }

    @DeleteMapping("/categorias/{id}")
    public ResponseEntity<GenericResponse>eliminar (@PathVariable Integer id){

        service.eliminar(id);
        GenericResponse respuesta = new GenericResponse();

        respuesta.isOk = true;
        respuesta.message = "Categoria eliminada";

        return ResponseEntity.ok(respuesta);
    }
}