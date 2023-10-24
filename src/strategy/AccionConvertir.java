package strategy;

import constants.Constantes;
import entities.Juguete;
import exceptions.ListaVaciaExcepcion;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AccionConvertir implements Accion {

    @Override
    public void aplicar(List<Juguete> juguetes) {
        if (juguetes.isEmpty()) throw new ListaVaciaExcepcion();

        // La pregunta pide que se convierta el Set de Juguetes en un mapa, pero ya convertí el Set a un List en el
        // menu, así que convertiré la lista a un Set para poder cumplirla.
        Set<Juguete> juguetesSet = new HashSet<>(juguetes);
        Map<Long, Juguete> juguetesMap = juguetesSet.stream()
                .collect(Collectors.toMap(
                        Juguete::getId,
                        juguete -> juguete
                ));

        for (Map.Entry<Long, Juguete> entry : juguetesMap.entrySet()) {
            System.out.printf("Key -> %d, Value -> %s\n", entry.getKey(), entry.getValue().toString());
        }
    }

    @Override
    public int getOpcion() {
        return Constantes.OPCION_CONVERTIR;
    }
}
