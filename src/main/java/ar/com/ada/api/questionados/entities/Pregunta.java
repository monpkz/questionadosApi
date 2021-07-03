package ar.com.ada.api.questionados.entities;

import java.util.*;

@Entity
@Table(name="pregunta")
public class Pregunta {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pregunta_id")
    private Integer preguntaId;

    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnaName = "categoria_id")
    private Integer categoriaId;

    private String enunciado;

    @OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Respuesta> opciones = new ArrayList<>();

    public void agregarRespuesta(Respuesta respuesta){
        this.opciones.add(respuesta);
    }

    public Integer getPreguntaId() {
        return preguntaId;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
        this.categoria.agregarPregunta(this);
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

   public void setPreguntaId(Integer preguntaId) {
        this.preguntaId = preguntaId;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
        this.categoria.agregarPregunta(this);
    }

    public List<Respuesta> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<Respuesta> opciones) {
        this.opciones = opciones;
    }

}