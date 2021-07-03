
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

    
}
