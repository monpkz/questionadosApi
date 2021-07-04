package ar.com.ada.api.questionados.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ar.com.ada.api.questionados.entities.*;
import ar.com.ada.api.questionados.services.PreguntaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ar.com.ada.api.questionados.models.request.InfoPreguntaNueva;
import ar.com.ada.api.questionados.models.response.GenericResponse;


@ResstController
public class PreguntaController {
    
    @Autowired
    private PreguntasService service;

    @GetMapping("/preguntas")
    public ResponseEntity<List<Pregunta>> traerPreguntas() {
        
        return ResponseEntity.ok(service.traerPreguntas());
    }

    @GetMapping("/preguntas/{id}")
    public ResponseEntity <Pregunta> buscarPreguntaPorId(@PathVariable Integer id){
        
        return ResponseEntity.ok(service.buscarPreguntaPorId(id));
    }

    PostMapping ("/preguntas")
    public ResponseEntity<?> crearPregunta(@RequesrBody InfoPreguntaNueva preguntaNueva) {
        GenericResponse respuesta = newGenericResponse();

        Pregunta pregunta = servicecrearPregunta(preguntaNueva.enunciado,)
        respuestaa.isOk = true;
        respuesta.id = pregunta.getPreguntaId();
        respuesta.message = "La pregunta fue creada con exito.";

        return ResponseEntity.ok(preguntaNueva);
    }
}
