

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informacion;

/**
 *
 * @author Cardona
 */
public class Producto {
    
    private int existencias;
    private String nombre;

    public Producto(String nombre) {
        this.existencias = 0;
        this.nombre = nombre;
    }
    
    

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias += existencias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    

}
