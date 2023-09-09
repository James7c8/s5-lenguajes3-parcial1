package strategy;

import entities.Juguete;

public interface Accion {

    Juguete aplicar();
    int getOpcion();
}
