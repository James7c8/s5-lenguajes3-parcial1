package strategy;

import entities.Juguete;
import constants.Constantes;

public class AccionEliminar implements Accion {

    @Override
    public Juguete aplicar() {
        return null;

    }

    @Override
    public int getOpcion() {
        return Constantes.OPCION_ELIMINAR;
    }
}
