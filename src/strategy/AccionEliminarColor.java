package strategy;

import constants.Constantes;
import entities.Juguete;
import exceptions.ListaVaciaExcepcion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class AccionEliminarColor implements Accion {

    Scanner sc = new Scanner(System.in);

    @Override
    public void aplicar(List<Juguete> juguetes) {
        if (juguetes.isEmpty()) throw new ListaVaciaExcepcion();

        // La pregunta pide que se convierta el Set de Juguetes en un mapa, pero ya convertí el Set a un List en el
        // menu, así que convertiré la lista a un Set para poder cumplirla.
        Set<Juguete> juguetesSet = new HashSet<>(juguetes);
        Set<String> coloresSet = juguetesSet.stream()
                .map(Juguete::getColor)
                .collect(Collectors.toSet());
        List<String> coloresList = new ArrayList<>(coloresSet);
        String colorEliminar = "error";

        boolean isInputOK = true;
        do {
            try {
                System.out.println("Digite el número del color que desee eliminar");
                for (int i = 0; i < coloresList.size(); i++) {
                    System.out.println((i + 1) + " - " + coloresList.get(i));
                }
                int opcion = sc.nextInt();
                sc.nextLine();
                colorEliminar = coloresList.get(opcion);
            } catch (InputMismatchException e) {
                isInputOK = false;
                sc.nextLine();
                System.out.println("\n  ERROR: Debe digitar un número entero");
            } catch (IndexOutOfBoundsException e) {
                isInputOK = false;
                System.out.println("  ERROR: Debe digitar una opción válida");
            }
        } while (!isInputOK);

        // Al parecer tiene que ser un variable final en un filter? Trabajo de mi IDE, no mío.
        String finalColorEliminar = colorEliminar;
        int cantidadJuguetesAntes = juguetesSet.size();
        juguetes.removeIf(juguete -> juguete.getColor().equals(finalColorEliminar));
        int cantidadJuguetesDespues = juguetesSet.size();

        // Intenté usar LongStream y fallé.

        if (cantidadJuguetesAntes != cantidadJuguetesDespues) {
            int id = 1;
            for (Juguete juguete : juguetesSet) {
                juguete.setId(id++);
            }
        }
    }

    @Override
    public int getOpcion() {
        return Constantes.OPCION_ELIMINAR_COLOR;
    }
}
