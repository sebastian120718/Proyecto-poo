import java.util.ArrayList;

public class ResultadoEncuesta {

    private int totalRespuestas;
    private double promedioGeneral;

    public void calcular(ArrayList<Respuesta> respuestas) {
        int suma = 0;

        for (Respuesta r : respuestas) {
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