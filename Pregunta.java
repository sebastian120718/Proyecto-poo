public class Pregunta {

    private int id;
    private String texto;
    private int minimo;
    private int maximo;

    public Pregunta(int id, String texto) {
        this.id = id;
        this.texto = texto;
        this.minimo = 1;
        this.maximo = 5;
    }

    public boolean validar(int valor) {
        return valor >= minimo && valor <= maximo;
    }

    public String getTexto() {
        return texto;
    }
}