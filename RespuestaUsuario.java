public class RespuestaUsuario {

    private int valor;
    private PreguntaCalificacion pregunta;
    private String fecha;
    private EncuestaAcademica encuesta;

    public RespuestaUsuario(
            int valor,
            PreguntaCalificacion pregunta,
            String fecha,
            EncuestaAcademica encuesta) {

        this.valor = valor;
        this.pregunta = pregunta;
        this.fecha = fecha;
        this.encuesta = encuesta;
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

    public EncuestaAcademica getEncuesta() {
        return encuesta;
    }
}