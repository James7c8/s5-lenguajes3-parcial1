package exceptions;

public class JugueteCreacionExcepcion extends RuntimeException {
    
    public JugueteCreacionExcepcion(String juguete) {
        super("\nERROR: No se pudo crear el " + juguete);
    }
}
