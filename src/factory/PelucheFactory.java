package factory;

import entities.Juguete;
import entities.Peluche;
import exceptions.JugueteCreacionExcepcion;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PelucheFactory implements Factory {

    @Override
    public Juguete crear() {

        Scanner scanner = new Scanner(System.in);

        int intentos = 0;
        do {
            try {

                System.out.print("\nIngrese el relleno del peluche: \n > ");
                String relleno = scanner.nextLine();

                System.out.print("\nIngrese el material exterior del peluche: \n > ");
                String materialExterior = scanner.nextLine();

                System.out.print("\nIngrese el color del peluche: \n > ");
                String color = scanner.nextLine();

                return Peluche.builder()
                    .relleno(relleno)
                    .materialExterior(materialExterior)
                    .color(color)
                    .build();

            // El usuario tiene tres intentos hasta que se lance la excepción.
            } catch (InputMismatchException e) {
                intentos++;
                scanner.nextLine();
                System.out.println("\nERROR: Debe ingresar información válida");
                System.out.println("Intento " + intentos + " de 3");
            }
        } while (intentos < 3);

        throw new JugueteCreacionExcepcion("peluche");
    }

}
