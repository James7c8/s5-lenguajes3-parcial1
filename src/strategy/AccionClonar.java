package strategy;

import entities.Juguete;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import constants.Constantes;
import utils.Utils;

public class AccionClonar implements Accion {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void aplicar(List<Juguete> juguetes) {

        if (juguetes.isEmpty()) {
            System.out.println("\nERROR: No hay juguetes registrados");
            return;
        }

        boolean isInputOK = true;
        do {
            try {
                System.out.println("\nDigite el ID del juguete que desea clonar");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("\nCuantos desea clonar?");
                int cantidad = scanner.nextInt();
                scanner.nextLine();

                for (int i = 0; i < cantidad; i++) {
                    Juguete clonJuguete = juguetes.get(id - 1).clone();
                    clonJuguete.setId(juguetes.size() + 1);
                    juguetes.add(clonJuguete);
                }

            } catch (InputMismatchException e) {
                isInputOK = false;
                scanner.nextLine();
                System.out.println("\nERROR: Debe digitar un número entero");

            } catch (IndexOutOfBoundsException e) {
                isInputOK = false;
                System.out.println("\nERROR: Actualmente se encuentran " + juguetes.size()
                        + " juguetes registrados,\n       por favor digite un ID válido (entre 1 y "
                        + juguetes.size() + ")");
            }
        } while (!isInputOK);
    }

    @Override
    public int getOpcion() {
        return Constantes.OPCION_CLONAR;
    }
}
