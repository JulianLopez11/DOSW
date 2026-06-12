package edu.dosw.lab.Reto3;

import java.util.*;

public class PlanningPoker {
    static List<String> tareas = new ArrayList<>();
    static List<Integer> finalV = new ArrayList<>();

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de personas que componen el grupo: ");
        int numeroPersonas = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el numero de tareas por realizar: ");
        int numeroTareas = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numeroTareas; i++) {
            System.out.print("Tarea " + (i + 1) + ": ");
            String entrada = scanner.nextLine();
            tareas.add(entrada);
        }
        menu();
        while (true) {
            for (int i = 0; i < tareas.size(); i++) {
                boolean votosValidos = false;
                while (!votosValidos) {
                    List<Integer> votos = new ArrayList<>();
                    System.out.println("Votacion Tarea " + (i + 1));
                    for (int j = 0; j < numeroPersonas; j++) {
                        int votacion = scanner.nextInt();
                        votos.add(votacion);
                    }
                    if (ValidateVotes.validateVotesFibonacci(votos)) {
                        if (ValidateVotes.checkAmountVotes(votos)) {
                            votosValidos = true;
                            finalV.add(votos.get(0));
                        } else {
                            System.out.println("Votos divergentes – Discutan y vuelvan a votar");
                        }
                    } else {
                        System.out.println(
                                "Hubo un numero que no pertenecia a la sucesion de fibonacci se repite la encuesta.");
                    }
                }
            }
            break;
        }
        resumen();
        scanner.close();
    }

    public static void menu() {
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + "." + tareas.get(i));
        }
    }

    public static void resumen() {
        System.out.println("---Resumen---");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println("Tarea " + (i + 1) + ": " + tareas.get(i) + " " + " Puntaje Final: " + finalV.get(i));
        }

    }

}
