package ejemplo;

public class Rectangulo {

    private int alto;

    private int ancho;

    public Rectangulo(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public int area() {

        return alto * ancho;
    }

    public int perimetro() {
        return 2 * alto + 2 * ancho;

    }

}
