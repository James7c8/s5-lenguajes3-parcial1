package strategy;

import constants.Constantes;
import entities.Carrito;
import entities.Juguete;
import entities.Peluche;
import exceptions.ListaVaciaExcepcion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AccionImprimirJuguete implements Accion {
    @Override
    public void aplicar(List<Juguete> juguetes) {

        if (juguetes.isEmpty()) {
            throw new ListaVaciaExcepcion();
        }

        Scanner scanner = new Scanner(System.in);

        List<Juguete> juguetesDesc = new ArrayList<>();
        for (int i = juguetes.size(); i > 0; i--) {
            juguetesDesc.add(juguetes.get(i - 1));
        }

        try {
            System.out.println("\n..IMPRIMIR\nQuiere imprimir un peluche o un carrito?");
            System.out.print("  1 - Peluche \n  2 - Carrito \n  " + Constantes.OPCION_SALIR
                    + " - SALIR\n > ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    juguetesDesc.stream()
                            .filter(juguete -> juguete instanceof Peluche)
                            .forEach(System.out::println);
                    return;
                case 2:
                    juguetesDesc.stream()
                            .filter(juguete ->  juguete instanceof Carrito)
                            .forEach(System.out::println);
                    return;
                case Constantes.OPCION_SALIR:
                    return;
                default:
                    throw new IndexOutOfBoundsException();
            }

        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("\n  ERROR: Debe digitar un número entero");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("  ERROR: Debe digitar una opción válida");
        }
    }

    @Override
    public int getOpcion() {
        return Constantes.OPCION_IMPRIMIR_JUGUETE;
    }
}
