public class Respuesta {

    private int valor;
    private Pregunta pregunta;
    private String fechaRegistro;

    public Respuesta(int valor, Pregunta pregunta, String fecha) {
        this.valor = valor;
        this.pregunta = pregunta;
        this.fechaRegistro = fecha;
    }

    public boolean esValida() {
        return pregunta.validar(valor);
    }

    public int getValor() {
        return valor;
    }
}