import java.util.ArrayList;

public class EncuestadoRegistrado {

    private ArrayList<RespuestaUsuario> respuestas;

    public EncuestadoRegistrado() {
        respuestas = new ArrayList<>();
    }

    public void responderEncuesta(EncuestaAcademica encuesta, ArrayList<Integer> valores) {

        ArrayList<PreguntaCalificacion> preguntas = encuesta.getPreguntas();

        for (int i = 0; i < preguntas.size(); i++) {

            int valor = valores.get(i);
            PreguntaCalificacion p = preguntas.get(i);

            if (p.validar(valor)) {
                RespuestaUsuario r = new RespuestaUsuario(valor, p, "2026", encuesta);
                respuestas.add(r);
            }
        }
    }

    public ArrayList<RespuestaUsuario> getRespuestas() {
        return respuestas;
    }
}