package entities;

public class Carrito implements Juguete {

    private long id;
    private String marca;
    private String numeroPuertas;
    private String color;

    public Carrito(long id, String marca, String numeroPuertas, String color) {
        this.id = id;
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.color = color;
    }

    public static CarritoBuilder builder() {
        return new CarritoBuilder();
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
        private String numeroPuertas;
        private String color;

        public CarritoBuilder id(long id) {
            this.id = id;
            return this;
        }

        public CarritoBuilder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public CarritoBuilder numeroPuertas(String numeroPuertas) {
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
