package strategy;

import entities.Juguete;
import factory.CarritoFactory;
import factory.Factory;
import factory.PelucheFactory;
import constants.Constantes;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AccionCrear implements Accion {

    @Override
    public void aplicar(List<Juguete> juguetes) {

        Scanner scanner = new Scanner(System.in);

        boolean isInputOK = true;
        do {
            try {
                System.out.println("\n..CREAR\nQuiere crear un peluche o un carrito?");
                System.out.print("  1 - Peluche \n  2 - Carrito \n  " + Constantes.OPCION_SALIR
                        + " - SALIR\n > ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                Factory factory;
                if (opcion == 1)
                    factory = new PelucheFactory();
                else if (opcion == 2)
                    factory = new CarritoFactory();
                else if (opcion == Constantes.OPCION_SALIR)
                    return;
                else {
                    throw new IndexOutOfBoundsException();
                }

                Juguete nuevoJuguete = factory.crear();
                nuevoJuguete.setId(juguetes.size() + 1);
                juguetes.add(nuevoJuguete);


            } catch (InputMismatchException e) {
                isInputOK = false;
                scanner.nextLine();
                System.out.println("\n  ERROR: Debe digitar un número entero");
            } catch (IndexOutOfBoundsException e) {
                isInputOK = false;
                System.out.println("  ERROR: Debe digitar una opción válida");
            }
        } while (!isInputOK);
    }

    @Override
    public int getOpcion() {
        return Constantes.OPCION_CREAR;
    }
}
