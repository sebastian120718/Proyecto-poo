import java.util.ArrayList;

public class Encuesta {

    private int id;
    private String titulo;
    private ArrayList<Pregunta> preguntas;

    public Encuesta(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.preguntas = new ArrayList<>();
        cargarPreguntas();
    }

    private void cargarPreguntas() {
        preguntas.add(new Pregunta(1, "¿Cómo calificas la calidad académica?"));
        preguntas.add(new Pregunta(2, "¿Cómo calificas la atención administrativa?"));
        preguntas.add(new Pregunta(3, "¿Cómo calificas las instalaciones?"));
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean estaDisponible() {
        return true;
    }
}