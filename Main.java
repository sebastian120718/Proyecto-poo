import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SistemaEncuestas sistema = new SistemaEncuestas();

        // 🔹 Crear encuesta (simula que ya existe en el sistema)
        Encuesta encuesta = new Encuesta(1, "Encuesta de satisfacción USB");
        sistema.agregarEncuesta(encuesta);

        System.out.println("=== SISTEMA DE ENCUESTAS ===\n");

        // 🔹 CASO DE USO: Ver encuestas disponibles
        System.out.println("Encuestas disponibles:");
        System.out.println("1. " + encuesta.getTitulo());

        // 🔹 CASO DE USO: Elegir encuesta
        System.out.print("\nSeleccione una encuesta (1): ");
        int opcion = sc.nextInt();

        if (opcion != 1) {
            System.out.println("Opción inválida");
            return;
        }

        // 🔹 CASO DE USO: Ver detalles
        System.out.println("\nHas seleccionado: " + encuesta.getTitulo());

        // 🔹 CASO DE USO: Empezar a responder
        ArrayList<Integer> valores = new ArrayList<>();

        for (Pregunta p : encuesta.getPreguntas()) {

            int valor;

            do {
                System.out.println("\n" + p.getTexto());
                System.out.println("1 = Muy malo | 2 = Malo | 3 = Regular | 4 = Bueno | 5 = Excelente");
                System.out.print("Respuesta: ");

                valor = sc.nextInt();

                if (!p.validar(valor)) {
                    System.out.println("❌ Debe ser entre 1 y 5");
                }

            } while (!p.validar(valor));

            valores.add(valor);
        }

        // 🔹 CASO DE USO: Guardar y enviar respuestas
        sistema.responderEncuesta(encuesta, valores);
        System.out.println("\n✅ Respuestas guardadas correctamente");

        // 🔹 CASO DE USO: Ver resultados
        ResultadoEncuesta resultado = new ResultadoEncuesta();
        resultado.calcular(sistema.getRespuestas());

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Promedio: " + resultado.getPromedioGeneral());
        System.out.println("Fortalezas: " + resultado.obtenerFortalezas());
        System.out.println("Oportunidades: " + resultado.obtenerOportunidades());

        // 🔹 CASO DE USO: Volver al inicio (simulado)
        System.out.println("\n🔄 Volviendo al inicio...");

        sc.close();
    }
}