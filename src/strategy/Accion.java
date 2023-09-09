package strategy;

import java.util.List;
import entities.Juguete;


public interface Accion {

    List<Juguete> aplicar(List<Juguete> juguetes);
    int getOpcion();
}
