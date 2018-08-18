package Objetos;
/**
 * @author Cardona
 */
public class Producto {
    private double precio;
    private String nombre;
    private int existencia;

    public Producto(double precio, String nombre) {
        //Inicializador de variables
        this.precio = precio;
        this.nombre = nombre;
        this.existencia = 0;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
    
    
    
    
    
}
