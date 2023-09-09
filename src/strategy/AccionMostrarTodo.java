package strategy;

import entities.Juguete;
import java.util.List;
import constants.Constantes;

public class AccionMostrarTodo implements Accion {

    @Override
    public List<Juguete> aplicar(List<Juguete> juguetes) {
        return null;
    }

    @Override
    public int getOpcion() {
        return Constantes.OPCION_MOSTRAR_TODO;
    }
}
