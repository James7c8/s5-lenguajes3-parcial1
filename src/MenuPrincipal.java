import entities.Juguete;

import java.util.ArrayList;
import java.util.List;

public class MenuPrincipal {

    private static MenuPrincipal instance;
    private List<Juguete> juguetes = new ArrayList<>();

    public static MenuPrincipal getInstance() {
        if(instance == null) {
            instance = new MenuPrincipal();
        }
        return instance;
    }

    public List<Juguete> getJuguetes() {
        return juguetes;
    }
}
