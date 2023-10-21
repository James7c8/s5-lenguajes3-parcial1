package strategy;

import constants.Constantes;
import entities.Carrito;
import entities.Juguete;
import exceptions.ListaVaciaExcepcion;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class AccionImprimirPuertas implements Accion {
    @Override
    public void aplicar(List<Juguete> juguetes) {

        if (juguetes.isEmpty()) throw new ListaVaciaExcepcion();

        Set<Carrito> carritos = juguetes.stream()
                                    .filter(juguete -> juguete instanceof Carrito)
                                    .map(juguete -> (Carrito) juguete)
                                    .collect(Collectors.toSet());
    }

    @Override
    public int getOpcion() {
        return Constantes.OPCION_IMPRIMIR_PUERTAS;
    }
}
