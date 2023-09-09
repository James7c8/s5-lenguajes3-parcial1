import entities.Juguete;
import strategy.Accion;
import strategy.AccionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MenuPrincipal {

    private static MenuPrincipal instance;
    private List<Juguete> juguetes = new ArrayList<>();

    public static MenuPrincipal getInstance() {
        if(instance == null) {
            instance = new MenuPrincipal();
        }
        return instance;
    }

    public void mostrarMenu() {
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
            else juguetes.add(accion.aplicar());

        } while (opcion != Constantes.OPCION_SALIR);
    }

    public List<Juguete> getJuguetes() {
        return juguetes;
    }
}
