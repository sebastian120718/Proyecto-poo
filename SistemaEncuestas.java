import java.util.ArrayList;

public class SistemaEncuestas {

    private ArrayList<Encuesta> encuestas;

    public SistemaEncuestas() {
        encuestas = new ArrayList<>();
    }

    public void agregarEncuesta(Encuesta e) {
        encuestas.add(e);
    }

    public ArrayList<Encuesta> getEncuestas() {
        return encuestas;
    }
}