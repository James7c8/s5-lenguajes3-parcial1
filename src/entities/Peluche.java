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

    public static PelucheBuilder builder() {
        return new PelucheBuilder();
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getMaterialExterior() {
        return materialExterior;
    }

    public void setMaterialExterior(String materialExterior) {
        this.materialExterior = materialExterior;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
