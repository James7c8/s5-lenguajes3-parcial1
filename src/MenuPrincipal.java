import entities.Juguete;
import strategy.Accion;
import strategy.AccionHandler;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import constants.Constantes;

public class MenuPrincipal {

    private static MenuPrincipal instance;
    private List<Juguete> juguetes = new ArrayList<>();

    public static MenuPrincipal getInstance() {
        if (instance == null) {
            instance = new MenuPrincipal();
        }
        return instance;
    }

    public void ejecutarMenu() {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Accion> strategy = AccionHandler.getStrategy();

        boolean isInputOK = true;
        do {
            try {
                int opcion;
                do {
                    imprimirMenu();
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    Accion accion = strategy.get(opcion);

                    if (opcion == Constantes.OPCION_SALIR) {
                        System.out.println("\nPrograma salido con éxito\n");
                        break;
                    } else {
                        juguetes = accion.aplicar(juguetes);
                    }
                    
                } while (opcion != Constantes.OPCION_SALIR);

            } catch (InputMismatchException e) {
                isInputOK = false;
                scanner.nextLine();
                System.out.println("\nERROR: Debe digitar un número entero");

            } catch (NullPointerException e) {
                isInputOK = false;
                System.out.println("\nERROR: Debe digitar una opción válida");
            }

        } while (!isInputOK);

        scanner.close();
    }

    private void imprimirMenu() {
        System.out.print("\n----------------------------------\n"
                            + "--------- MENU PRINCIPAL ---------\n"
                            + "----------------------------------\n" 
                            + "  Digite una opción \n\n"
                            + "  1 - CREAR un juguete\n" 
                            + "  2 - CLONAR un juguete\n"
                            + "  3 - ELIMINAR un juguete\n"
                            + "  4 - MOSTRAR todos los juguetes\n\n  " + Constantes.OPCION_SALIR
                            + " - SALIR \n" + "----------------------------------\n  > ");
    }
}
