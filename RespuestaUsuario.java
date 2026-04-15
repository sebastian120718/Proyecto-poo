public class RespuestaUsuario {

    private int valor;
    private PreguntaCalificacion pregunta;
    private String fecha;

    public RespuestaUsuario(int valor, PreguntaCalificacion pregunta, String fecha) {
        this.valor = valor;
        this.pregunta = pregunta;
        this.fecha = fecha;
    }

    public int getValor() {
        return valor;
    }

    public PreguntaCalificacion getPregunta() {
        return pregunta;
    }

    public String getFecha() {
        return fecha;
    }
}