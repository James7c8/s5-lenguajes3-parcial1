import entities.Juguete;
import factory.Factory;
import factory.PelucheFactory;
import strategy.Accion;
import strategy.AccionCrear;
import strategy.AccionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Juguete> juguetes = new ArrayList<>();


        MenuPrincipal menu = new MenuPrincipal();
        menu.mostrarMenu();

    }
}