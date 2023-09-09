package strategy;

import entities.Juguete;

public class AccionEliminar implements Accion {

    @Override
    public Juguete aplicar() {
        return null;

    }

    @Override
    public int getOpcion() {
        return 3;
    }
}
