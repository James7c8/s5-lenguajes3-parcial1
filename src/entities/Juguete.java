package entities;

public interface Juguete {

    void setId(long id);
    Long getId();
    String getColor();
    Juguete clone();
}
