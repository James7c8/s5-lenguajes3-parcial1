package strategy;

import java.util.List;
import java.util.Set;

import entities.Juguete;


public interface Accion {

    void aplicar(List<Juguete> juguetes);
    int getOpcion();
}
