package strategy;

import constants.Constantes;
import entities.Carrito;
import entities.Juguete;
import exceptions.ListaVaciaExcepcion;
import org.w3c.dom.ls.LSOutput;

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

        Optional<Carrito> carritoMaxPuertas = carritos.stream()
                .max(Comparator.comparing(Carrito::getNumeroPuertas));

        carritoMaxPuertas.ifPresentOrElse(
            carrito -> System.out.println(carrito),
            () -> System.out.println("No hay carritos en la lista")
        );
    }

    @Override
    public int getOpcion() {
        return Constantes.OPCION_IMPRIMIR_PUERTAS;
    }
}
