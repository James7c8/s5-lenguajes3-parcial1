package strategy;

import constants.Constantes;
import entities.Juguete;
import factory.CarritoFactory;
import factory.Factory;
import factory.PelucheFactory;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AccionImprimir implements Accion {
    @Override
    public void aplicar(List<Juguete> juguetes) {
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
                            .filter(juguete -> juguete.toString().contains("Peluche"))
                            .forEach(System.out::println);
                    return;
                case 2:
                    juguetesDesc.stream()
                            .filter(juguete -> juguete.toString().contains("Carrito"))
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
        return Constantes.OPCION_IMPRIMIR;
    }
}
