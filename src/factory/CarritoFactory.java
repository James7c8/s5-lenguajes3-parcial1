package factory;

import entities.Carrito;
import entities.Juguete;
import exceptions.JugueteCreacionExcepcion;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CarritoFactory implements Factory {

    @Override
    public Juguete crear() {

        Scanner scanner = new Scanner(System.in);
        
        int intentos = 1;
        do {
            try {
                System.out.print("\nIngrese la marca del carrito: \n > ");
                String marca = scanner.nextLine();
                
                System.out.print("\nDigite la cantidad de puertas del carrito: \n > ");
                int numeroPuertas = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("\nIngrese el color del carrito: \n > ");
                String color = scanner.nextLine();
                
                return Carrito.builder()
                    .marca(marca)
                    .numeroPuertas(numeroPuertas)
                    .color(color)
                    .build();

            // El usuario tiene tres intentos hasta que se lance la excepción.
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("\nERROR: Debe ingresar información válida");
                System.out.println("Intento " + intentos + " de 3");
                intentos++;
            }
        } while (intentos < 3);

        throw new JugueteCreacionExcepcion("carrito");
    }
}
