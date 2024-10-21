
package meta.pkg3.pkg2.pkg1;

public abstract class Figura2D implements Figura {
     private String nombre;
    private String color;


    public Figura2D(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

  
    public abstract double calcularArea();


    public abstract double calcularPerimetro();


    public String getNombre() {
        return nombre;
    }


    public String getColor() {
        return color;
    }
     public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
    }
}
