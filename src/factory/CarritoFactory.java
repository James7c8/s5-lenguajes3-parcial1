package factory;

import entities.Carrito;
import entities.Juguete;

import java.util.Scanner;

public class CarritoFactory implements Factory {

    @Override
    public Juguete crear() {

        //TODO excepttions.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la marca del carrito: ");
        String marca = scanner.nextLine();
        System.out.println("Digite la cantidad de puertas del carrito: ");
        int numeroPuertas = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el color del carrito: ");
        String color = scanner.nextLine();

        return Carrito.builder()
                .marca(marca)
                .numeroPuertas(numeroPuertas)
                .color(color)
                .build();
    }
}
