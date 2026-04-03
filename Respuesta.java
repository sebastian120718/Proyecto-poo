public class Respuesta {

    private int valor;
    private Pregunta pregunta;
    private String fecha;

    public Respuesta(int valor, Pregunta pregunta, String fecha) {
        this.valor = valor;
        this.pregunta = pregunta;
        this.fecha = fecha;
    }

    public int getValor() {
        return valor;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public String getFecha() {
        return fecha;
    }
}