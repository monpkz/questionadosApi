package ar.com.ada.api.questionados.entities;

import java.util.*;

public class Pregunta {

    
    private Integer preguntaId;

    private String  pregunta;

    private Integer categoriaId;

    private Categoria categoria;

    private String enunciado;

    private List<Respuesta> opciones = new ArrayList<>();

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public List<Respuesta> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<Respuesta> opciones) {
        this.opciones = opciones;
    }

    public void agregarOpcion(String textoOpcion, boolean esCorrecta) {
        Respuesta r = new Respuesta(textoOpcion, esCorrecta);
        this.opciones.add(r);
    }

    public void agregarOpcion(String textoOpcion) {
        this.agregarOpcion(textoOpcion, false);

    }

    public void agregarOpcionFalsa(String textoOpcion) {
        this.agregarOpcion(textoOpcion, false);
    }

}
