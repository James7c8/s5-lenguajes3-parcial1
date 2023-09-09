package strategy;

import entities.Juguete;

import java.util.ArrayList;
import java.util.List;

public interface Accion {

    Juguete aplicar();
    int getOpcion();
}
