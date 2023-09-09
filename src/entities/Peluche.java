package entities;

public class Peluche implements Juguete {

    private long id;
    private String relleno;
    private String materialExterior;
    private String color;

    public Peluche(long id, String relleno, String materialExterior, String color) {
        this.id = id;
        this.relleno = relleno;
        this.materialExterior = materialExterior;
        this.color = color;
    }

    public Peluche(Peluche peluche) {
        this.relleno = peluche.relleno;
        this.materialExterior = peluche.materialExterior;
        this.color = peluche.color;
    }

    public static PelucheBuilder builder() {
        return new PelucheBuilder();
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public Peluche clone() {
        return new Peluche(this);
    }


    @Override
    public String toString() {
        return "entities.Peluche{" +
                "id=" + id +
                ", relleno='" + relleno + '\'' +
                ", materialExterior='" + materialExterior + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static class PelucheBuilder {

        private long id;
        private String relleno;
        private String materialExterior;
        private String color;

        public PelucheBuilder id(long id) {
            this.id = id;
            return this;
        }

        public PelucheBuilder relleno(String relleno) {
            this.relleno = relleno;
            return this;
        }

        public PelucheBuilder materialExterior(String materialExterior) {
            this.materialExterior = materialExterior;
            return this;
        }

        public PelucheBuilder color(String color) {
            this.color = color;
            return this;
        }

        public Peluche build() {
            return new Peluche(id, relleno, materialExterior, color);
        }
    }


}
