package strategy;

import entities.Juguete;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import constants.Constantes;

public class AccionClonar implements Accion {

    private int idClonar;
    private List<Juguete> juguetes;
    private Scanner scanner = new Scanner(System.in);

    public void setIdClonar(List<Juguete> juguetes) {
        this.juguetes = juguetes;
        
        System.out.println("Digite el ID del juguete que desea clonar");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        this.idClonar = opcion;
    }

    @Override
    public Juguete aplicar() {
        Juguete jugueteClonar = juguetes.get(idClonar);
        return null;
    }

    @Override
    public int getOpcion() {
        return Constantes.OPCION_CLONAR;
    }
}
