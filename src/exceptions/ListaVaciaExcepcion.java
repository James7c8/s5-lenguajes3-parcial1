package exceptions;

public class ListaVaciaExcepcion extends RuntimeException {
    public ListaVaciaExcepcion() {
        super("No se ha creado un juguete. Agregue un juguete para utilizar esta función.");
    }
}
