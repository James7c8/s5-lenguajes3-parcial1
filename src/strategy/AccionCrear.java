package strategy;

import entities.Juguete;
import factory.CarritoFactory;
import factory.Factory;
import factory.PelucheFactory;

import java.util.Scanner;

public class AccionCrear implements Accion {

    @Override
    public Juguete aplicar() {

        Scanner scanner = new Scanner(System.in);
        // TODO exceptions.
        System.out.println("Quiere crear un peluche o un carrito?");
        System.out.println("(1) Peluche \n(2) Carrito \n(3) SALIR");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        Factory factory;
        if (opcion == 1) factory = new PelucheFactory();
        else if (opcion == 2) factory = new CarritoFactory();
        else return null; // TODO.

        return factory.crear();
    }

    @Override
    public int getOpcion() {
        return 1;
    }
}
