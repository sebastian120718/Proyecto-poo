import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SistemaEncuestas sistema = new SistemaEncuestas();

        // Crear encuestas
        Encuesta e1 = new Encuesta(1, "Encuesta Universidad");
        Encuesta e2 = new Encuesta(2, "Encuesta Servicios");

        sistema.agregarEncuesta(e1);
        sistema.agregarEncuesta(e2);

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ver encuestas");
            System.out.println("2. Responder encuesta");
            System.out.println("3. Ver resultados");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // 🔥 limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.println("\n=== LISTA DE ENCUESTAS ===");
                    for (Encuesta e : sistema.getEncuestas()) {
                        System.out.println("ID: " + e.getId() + " - " + e.getTitulo());
                    }
                    break;

                case 2:
                    System.out.println("\n=== RESPONDER ENCUESTA ===");
                    System.out.print("Ingrese el ID de la encuesta: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    Encuesta seleccionada = null;

                    for (Encuesta e : sistema.getEncuestas()) {
                        if (e.getId() == id) {
                            seleccionada = e;
                        }
                    }

                    if (seleccionada != null) {

                        ArrayList<Integer> valores = new ArrayList<>();

                        for (Pregunta p : seleccionada.getPreguntas()) {
                            System.out.println(p.getTexto() + " (1-5): ");
                            int val = sc.nextInt();
                            sc.nextLine();
                            valores.add(val);
                        }

                        sistema.responderEncuesta(seleccionada, valores);
                        System.out.println("✅ Encuesta respondida correctamente");

                    } else {
                        System.out.println("❌ Encuesta no encontrada");
                    }
                    break;

                case 3:
                    System.out.println("\n=== RESULTADOS ===");

                    for (Respuesta r : sistema.getRespuestas()) {
                        System.out.println("Pregunta: " + r.getPregunta().getTexto());
                        System.out.println("Respuesta: " + r.getValor());
                        System.out.println("Fecha: " + r.getFecha());
                        System.out.println("-------------------");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("❌ Opción inválida");
            }

            // 🔥 pausa para que no “salte” el menú
            if (opcion != 0) {
                System.out.println("\nPresione ENTER para continuar...");
                sc.nextLine();
            }

        } while (opcion != 0);

        sc.close();
    }
}