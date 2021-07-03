public class PreguntasService {
    
    @Autowired
    PreguntaRepository repo;

    public Pregunta buscarPreguntaPorId(Integer preguntaId){
        Optional<Pregunta> resultado = repo.findById(preguntaId);

        if(resultado.isPresent())
            return resultado.get();
        
        
        return null;
        
        
    }

    public List<Pregunta> traerPreguntas(){
        return repo.findAll();
    }
}
