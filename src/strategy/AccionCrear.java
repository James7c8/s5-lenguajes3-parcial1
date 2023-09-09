package strategy;

import entities.Juguete;
import factory.CarritoFactory;
import factory.Factory;
import factory.PelucheFactory;
import constants.Constantes;
import java.util.List;
import java.util.Scanner;

public class AccionCrear implements Accion {

    @Override
    public List<Juguete> aplicar(List<Juguete> juguetes) {

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

        Juguete nuevoJuguete = factory.crear();
        nuevoJuguete.setId(juguetes.size() + 1);
        juguetes.add(nuevoJuguete);

        return juguetes;
    }

    @Override
    public int getOpcion() {
        return Constantes.OPCION_CREAR;
    }
}
