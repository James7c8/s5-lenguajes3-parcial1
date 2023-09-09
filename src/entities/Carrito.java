package entities;

public class Carrito implements Juguete {

    private long id;
    private String marca;
    private int numeroPuertas;
    private String color;
    private String juguete = "carrito";

    public Carrito(long id, String marca, int numeroPuertas, String color) {
        this.id = id;
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.color = color;
    }

    public Carrito(Carrito carrito) {
        this.marca = carrito.marca;
        this.numeroPuertas = carrito.numeroPuertas;
        this.color = carrito.color;
    }

    public static CarritoBuilder builder() {
        return new CarritoBuilder();
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public Carrito clone() {
        return new Carrito(this);
    }

    @Override
    public String toString() {
        return "entities.Carrito{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", numeroPuertas='" + numeroPuertas + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static class CarritoBuilder {

        private long id;
        private String marca;
        private int numeroPuertas;
        private String color;

        public CarritoBuilder id(long id) {
            this.id = id;
            return this;
        }

        public CarritoBuilder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public CarritoBuilder numeroPuertas(int numeroPuertas) {
            this.numeroPuertas = numeroPuertas;
            return this;
        }

        public CarritoBuilder color(String color) {
            this.color = color;
            return this;
        }

        public Carrito build() {
            return new Carrito(id, marca, numeroPuertas, color);
        }
    }
}
