import java.util.ArrayList;

public class SistemaEncuestas {

    private ArrayList<Encuesta> encuestas;
    private ArrayList<Respuesta> respuestas;

    public SistemaEncuestas() {
        encuestas = new ArrayList<>();
        respuestas = new ArrayList<>();
    }

    public void agregarEncuesta(Encuesta e) {
        encuestas.add(e);
    }

    public Encuesta obtenerEncuesta() {
        return encuestas.get(0); // simplificado
    }

    public void guardarRespuesta(Respuesta r) {
        respuestas.add(r);
    }

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }
}