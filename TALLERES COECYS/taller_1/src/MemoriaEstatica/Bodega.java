/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemoriaEstatica;

import Informacion.Producto;

/**
 *
 * @author Cardona
 */
public class Bodega {

    Producto[] inventario;
    int indice_vacio = 0;

    public Bodega() {
        this.inventario = new Producto[100];
    }

    public void AgregarProducto(String nombre) {
        if (indice_vacio < 100) {
            this.inventario[indice_vacio] = new Producto(nombre);
            indice_vacio++;
        } else {
            System.out.println("NO ES POSIBLE GUARDAR MAS PRODUCTOS");
        }
    }

    public void AgregarExistencias(int cantidad, String nombre) {
        int indice = -1;

        for (int i = 0; i < 100; i = i + 1) {
            Producto producto_pivote = this.inventario[i];
            if (producto_pivote != null) {
                String nombre_pivote = producto_pivote.getNombre();
                if (nombre_pivote.equals(nombre) == true) {
                    indice = i;
                    break;
                }
            } else {
                //NULL POINTER SI ACCESO A ATRIBUTOS DEL PRODUCTO PIVOTE   
            }
        }

        if (indice != -1) {
            Producto producto_encontrado = this.inventario[indice];
            producto_encontrado.setExistencias(cantidad);
            System.out.println("AGREGE EXISTENCIAS A PRODUCTO: " + nombre + " - " + cantidad);
        }else{
            System.out.println("NO SE PUDO AGREGAR EXISTENCIAS: " + nombre);
        }

    }

    public void ReporteProductosExistencias() {
        for (int i = 0; i <= 99; i++) {
            Producto producto_privote = this.inventario[i];
            if (producto_privote != null) {
                System.out.println("EXISTENCIAS---->" + producto_privote.getNombre() + " > cantidad existente: " + producto_privote.getExistencias());
            }
        }
    }

}
