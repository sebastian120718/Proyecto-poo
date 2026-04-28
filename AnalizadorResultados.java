import java.util.ArrayList;

public class AnalizadorResultados {

    private int totalRespuestas;
    private double promedioGeneral;

    public AnalizadorResultados() {
        totalRespuestas = 0;
        promedioGeneral = 0;
    }

    public void calcular(ArrayList<RespuestaUsuario> respuestas) {
        int suma = 0;

        for (RespuestaUsuario r : respuestas) {
            suma += r.getValor();
        }

        totalRespuestas = respuestas.size();
        promedioGeneral = (double) suma / totalRespuestas;
    }

    public double getPromedioGeneral() {
        return promedioGeneral;
    }

    public String obtenerFortalezas() {
        if (promedioGeneral >= 4) {
            return "Fortaleza";
        }
        return "";
    }

    public String obtenerOportunidades() {
        if (promedioGeneral < 3) {
            return "Oportunidad de mejora";
        }
        return "";
    }

    public void mostrarPorcentajes(
            ArrayList<RespuestaUsuario> respuestas,
            EncuestaAcademica encuesta) {

        for (PreguntaCalificacion pregunta : encuesta.getPreguntas()) {

            System.out.println("\nPregunta: " + pregunta.getTexto());

            int[] conteo = new int[5];
            int total = 0;

            for (RespuestaUsuario r : respuestas) {
                if (r.getPregunta().getId() == pregunta.getId()) {
                    int valor = r.getValor();
                    conteo[valor - 1]++;
                    total++;
                }
            }

            if (total == 0) {
                System.out.println("No hay respuestas.");
            } else {

                for (int i = 0; i < 5; i++) {
                    double porcentaje = (conteo[i] * 100.0) / total;

                    System.out.printf(
                        "Valor %d: %d respuestas (%.2f%%)%n",
                        (i + 1), conteo[i], porcentaje
                    );
                }
            }
        }
    }
}