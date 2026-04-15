import java.util.ArrayList;

public class AnalizadorResultados {

    private int totalRespuestas;
    private double promedioGeneral;

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
}