import java.util.ArrayList;

public class Usuario {

    private ArrayList<Respuesta> respuestas;

    public Usuario() {
        respuestas = new ArrayList<>();
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

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }
}