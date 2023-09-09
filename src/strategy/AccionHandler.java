package strategy;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AccionHandler {

    private AccionHandler() {
    }

    public static final Map<Integer, Accion> strategy =
            List.of(new AccionCrear(),
                    new AccionClonar(),
                    new AccionEliminar(),
                    new AccionMostrarTodo())
                .stream()
                .collect(Collectors.toMap(Accion::getOpcion, Function.identity()));

    public static Map<Integer, Accion> getStrategy() {
        return strategy;
    }
}
