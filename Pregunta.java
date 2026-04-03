public class Pregunta {

    private int id;
    private String texto;

    public Pregunta(int id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public boolean validar(int valor) {
        return valor >= 1 && valor <= 5;
    }
}