package strategy;

import entities.Juguete;
import entities.Peluche;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import constants.Constantes;

public class AccionClonar implements Accion {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public List<Juguete> aplicar(List<Juguete> juguetes) {
        
        System.out.println("Digite el ID del juguete que desea clonar");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Cuantos desea clonar?");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < cantidad; i++) {
            Juguete clonJuguete = juguetes.get(id - 1).clone();
            clonJuguete.setId(juguetes.size() + 1);
            juguetes.add(clonJuguete);
        }

        return juguetes;
    }

    @Override
    public int getOpcion() {
        return Constantes.OPCION_CLONAR;
    }
}
