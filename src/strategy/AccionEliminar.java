package strategy;

import entities.Juguete;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import constants.Constantes;

public class AccionEliminar implements Accion {

    Scanner scanner = new Scanner(System.in);

    @Override
    public List<Juguete> aplicar(List<Juguete> juguetes) {

        if (juguetes.isEmpty()) {
            System.out.println("\nERROR: No hay juguetes registrados");
            return juguetes;
        }

        boolean isInputOK = true;
        do {
            try {
                System.out.print("\n..ELIMINAR\n" + 
                "Digite el ID del juguete que desea eliminar \n  > ");
                int id = scanner.nextInt();
                scanner.nextLine();
                isInputOK = true;
               
                juguetes.remove(id - 1);

                // Recorrer la lista desde el juguete que se elminó. en vez de toda la lista.
                for (int i = (id - 1); i < juguetes.size(); i++) {
                    juguetes.get(i).setId(i + 1);
                }
            
            } catch (InputMismatchException e) {
                isInputOK = false;
                scanner.nextLine();
                System.out.println("\nERROR: Debe digitar un número entero");
            
            } catch (IndexOutOfBoundsException e) {
                isInputOK = false;
                System.out.println("\nERROR: Actualmente se encuentran " + 
                    juguetes.size() + 
                    " juguetes registrados,\n       por favor digite un ID válido (entre 1 y " + juguetes.size() + ")");
            }
        } while (!isInputOK);

        return juguetes;
    }

    @Override
    public int getOpcion() {
        return Constantes.OPCION_ELIMINAR;
    }
}
