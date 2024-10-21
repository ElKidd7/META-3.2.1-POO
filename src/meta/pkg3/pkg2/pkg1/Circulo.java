
package meta.pkg3.pkg2.pkg1;

public class Circulo extends Figura2D {
    private double radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }


    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }


    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
  