package utils;

import entities.Juguete;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Utils {
    public static List<Juguete> setToArray(Set<Juguete> jugueteSet) {
        List<Juguete> jugueteList = new ArrayList<>();
        for (Juguete juguete : jugueteSet) {
            jugueteList.add(juguete);
        }
        return jugueteList;
    }
}
