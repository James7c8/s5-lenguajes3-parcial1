import entities.Juguete;
import strategy.Accion;
import strategy.AccionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import constants.Constantes;

public class MenuPrincipal {

    private static MenuPrincipal instance;
    private List<Juguete> juguetes = new ArrayList<>();

    public static MenuPrincipal getInstance() {
        if(instance == null) {
            instance = new MenuPrincipal();
        }
        return instance;
    }

    public void ejecutarMenu() {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Accion> strategy = AccionHandler.getStrategy();

        int opcion;
        do {
            System.out.println(
                    "Ingrese una opción \n" +
                            "(1) - Crear un juguete\n" +
                            "(2) - Clonar un juguete\n" +
                            "(3) - Eliminar un juguete\n" +
                            "(4) - Mostrar todos los juguetes\n(" +
                            + Constantes.OPCION_SALIR + ") - SALIR"
            );
            opcion = scanner.nextInt();
            scanner.nextLine();
            Accion accion = strategy.get(opcion);

            if (accion == null && opcion!= Constantes.OPCION_SALIR) {
                System.out.println("Esta opcion no existe");
            }
            else if (accion == null && opcion == Constantes.OPCION_SALIR) {
                System.out.println("SALIDA EXITOSA");
            }
            else {
                juguetes = accion.aplicar(getJuguetes());
            }

        } while (opcion != Constantes.OPCION_SALIR);

        for (Juguete juguete : juguetes) {
            juguete.toString();
        }
    }

    public List<Juguete> getJuguetes() {
        return juguetes;
    }
}
