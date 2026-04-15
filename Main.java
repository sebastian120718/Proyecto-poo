import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void mostrarEncuestas(SistemaGestionEncuestas sistema) {
        System.out.println("\n=== LISTA DE ENCUESTAS ===");
        for (EncuestaAcademica e : sistema.getEncuestas()) {
            System.out.println("ID: " + e.getId() + " - " + e.getTitulo());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SistemaGestionEncuestas sistema = new SistemaGestionEncuestas();
        EncuestadoRegistrado usuario = new EncuestadoRegistrado();

        EncuestaAcademica e1 = new EncuestaAcademica(1, "Encuesta Universidad");
        EncuestaAcademica e2 = new EncuestaAcademica(2, "Encuesta Servicios");

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
            sc.nextLine();

            switch (opcion) {

                case 1:
                    mostrarEncuestas(sistema);
                    break;

                case 2:
                    System.out.println("\n=== RESPONDER ENCUESTA ===");

                    mostrarEncuestas(sistema);

                    EncuestaAcademica seleccionada = null;

                    while (seleccionada == null) {

                        System.out.print("\nIngrese el ID de la encuesta: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        for (EncuestaAcademica e : sistema.getEncuestas()) {
                            if (e.getId() == id) {
                                seleccionada = e;
                            }
                        }

                        if (seleccionada == null) {
                            System.out.println(" Encuesta no encontrada, intente de nuevo.");
                        }
                    }

                    ArrayList<Integer> valores = new ArrayList<>();

                    for (PreguntaCalificacion p : seleccionada.getPreguntas()) {
                        System.out.print(p.getTexto() + " (1-5): ");
                        int val = sc.nextInt();
                        sc.nextLine();
                        valores.add(val);
                    }

                    usuario.responderEncuesta(seleccionada, valores);
                    System.out.println("Encuesta respondida correctamente");

                    break;

                case 3:
                    System.out.println("\n=== RESULTADOS ===");

                    int suma = 0;
                    int total = 0;

                    for (RespuestaUsuario r : usuario.getRespuestas()) {
                        System.out.println("Pregunta: " + r.getPregunta().getTexto());
                        System.out.println("Respuesta: " + r.getValor());
                        System.out.println("Fecha: " + r.getFecha());
                        System.out.println("-------------------");

                        suma += r.getValor();
                        total++;
                    }

                    if (total > 0) {
                        double promedio = (double) suma / total;
                        System.out.println(" Promedio general: " + promedio);
                    } else {
                        System.out.println("No hay respuestas aún.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println(" Opción inválida");
            }

            if (opcion != 0) {
                System.out.println("\nPresione ENTER para continuar...");
                sc.nextLine();
            }

        } while (opcion != 0);

        sc.close();
    }
}