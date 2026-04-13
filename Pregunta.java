import java.nio.channels.Pipe.SourceChannel;

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
    if (valor >= 1 && valor <= 5) {
        return true;
    } else {
        System.out.println("Error: el valor debe estar entre 1 y 5");
        return false;
    }
}
    
}