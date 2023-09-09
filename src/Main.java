import entities.Juguete;
import factory.Factory;
import factory.PelucheFactory;
import strategy.Accion;
import strategy.AccionCrear;
import strategy.AccionHandler;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Integer, Accion> strategy = AccionHandler.getStrategy();

        int opcion;
        do {
            System.out.println(
                    "Ingrese una opción \n" +
                            "(1) - Crear\n" +
                            "(2) - Clonar\n" +
                            "(3) - Eliminar\n" +
                            "(4) - Mostrar Todo\n(" +
                            + Constantes.OPCION_SALIR + ") - SALIR"
            );
            opcion = scanner.nextInt();
            scanner.nextLine();
            Accion accion = strategy.get(opcion);

            if (accion == null && opcion!= Constantes.OPCION_SALIR) System.out.println("Esta opcion no existe");
            else if (accion == null && opcion == Constantes.OPCION_SALIR) System.out.println("SALIDA EXITOSA");
            else accion.aplicar();

        } while (opcion != Constantes.OPCION_SALIR);


    }
}