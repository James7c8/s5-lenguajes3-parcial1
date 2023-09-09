package factory;

import entities.Juguete;
import entities.Peluche;
import java.util.List;
import java.util.Scanner;

public class PelucheFactory implements Factory {

    

    @Override
    public Juguete crear() {

        // TODO exceptions.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el relleno del peluche: ");
        String relleno = scanner.nextLine();
        System.out.println("Ingrese el material exterior del peluche: ");
        String materialExterior = scanner.nextLine();
        System.out.println("Ingrese el color del peluche: ");
        String color = scanner.nextLine();

        return  Peluche.builder()
                .relleno(relleno)
                .materialExterior(materialExterior)
                .color(color)
                .build();
    }

}
