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

    public void responderEncuesta(Encuesta encuesta, ArrayList<Integer> valores) {

        ArrayList<Pregunta> preguntas = encuesta.getPreguntas();

        for (int i = 0; i < preguntas.size(); i++) {

            int valor = valores.get(i);
            Pregunta p = preguntas.get(i);

            if (p.validar(valor)) {
                Respuesta r = new Respuesta(valor, p, "2026");
                respuestas.add(r);
            }
        }
    }

    // 🔥 ESTE ERA EL QUE TE FALTABA
    public ArrayList<Encuesta> getEncuestas() {
        return encuestas;
    }

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }
}