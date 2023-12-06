package ejemplo;

public class Circulo {

    private int radio;


    public Circulo(int radio) {
        this.radio = radio;
    }

    public float areaCircular(int radio) {
        return 3.1416F * (radio * radio);
    }
}

