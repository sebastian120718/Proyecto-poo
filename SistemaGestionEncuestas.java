import java.util.ArrayList;

public class SistemaGestionEncuestas {

    private ArrayList<EncuestaAcademica> encuestas;

    public SistemaGestionEncuestas() {
        encuestas = new ArrayList<>();
    }

    public void agregarEncuesta(EncuestaAcademica e) {
        encuestas.add(e);
    }

    public ArrayList<EncuestaAcademica> getEncuestas() {
        return encuestas;
    }
}