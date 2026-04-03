import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SistemaEncuestas sistema = new SistemaEncuestas();
        Encuesta encuesta = new Encuesta(1, "Encuesta de satisfacción");

        sistema.agregarEncuesta(encuesta);

        ArrayList<Respuesta> respuestas = new ArrayList<>();

        System.out.println("=== " + encuesta.getTitulo() + " ===\n");

        for (Pregunta p : encuesta.getPreguntas()) {

            int valor;

            do {
                System.out.println(p.getTexto());
                System.out.println("1-5:");
                valor = sc.nextInt();

                if (!p.validar(valor)) {
                    System.out.println("Valor inválido\n");
                }

            } while (!p.validar(valor));

            Respuesta r = new Respuesta(valor, p, "2026");
            sistema.guardarRespuesta(r);
            respuestas.add(r);
        }

        // Resultados
        ResultadoEncuesta resultado = new ResultadoEncuesta();
        resultado.calcular(respuestas);

        System.out.println("\nPromedio: " + resultado.getPromedioGeneral());
        System.out.println(resultado.obtenerFortalezas());
        System.out.println(resultado.obtenerOportunidades());

        sc.close();
    }
}