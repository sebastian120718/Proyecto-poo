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

        if (id == 1) {
            preguntas.add(new Pregunta(1, "¿Cómo calificas la calidad académica?"));
            preguntas.add(new Pregunta(2, "¿Cómo calificas la atención administrativa?"));
            preguntas.add(new Pregunta(3, "¿Cómo calificas las instalaciones?"));
        }

        else if (id == 2) {
            preguntas.add(new Pregunta(1, "¿Cómo calificas el servicio recibido en bibloteca"));
            preguntas.add(new Pregunta(2, "¿Recomendarías la institución?"));
            preguntas.add(new Pregunta(3, "¿Cómo calificas la atención al cliente?"));
        }

    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public boolean estaDisponible() {
        return true;
    }
}