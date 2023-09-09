package strategy;

import entities.Juguete;

public class AccionMostrarTodo implements Accion {

    @Override
    public Juguete aplicar() {
        return null;
    }

    @Override
    public int getOpcion() {
        return 4;
    }
}
