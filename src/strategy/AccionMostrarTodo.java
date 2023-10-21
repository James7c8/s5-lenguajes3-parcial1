package strategy;

import entities.Juguete;
import java.util.List;
import java.util.Set;

import constants.Constantes;

public class AccionMostrarTodo implements Accion {

    @Override
    public void aplicar(List<Juguete> juguetes) {
        
        System.out.println("\n..LISTA DE LOS JUGUETES");
        for (Juguete juguete : juguetes) {
            System.out.println(juguete.toString());
        }
    }

    @Override
    public int getOpcion() {
        return Constantes.OPCION_MOSTRAR_TODO;
    }
}
