/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_1;

import MemoriaEstatica.Bodega;

/**
 *
 * @author Cardona
 */
public class SistemaGestionInventario {
    Bodega mi_bodega = new Bodega();

    public SistemaGestionInventario() {
    }
    
    public void IniciarSimulacion(){
        mi_bodega.AgregarProducto("PAPEL");
        mi_bodega.AgregarProducto("PAPEL HIGIENICO");
        mi_bodega.AgregarProducto("PAPEL ROTULO");
        mi_bodega.AgregarProducto("LAPIZ");
        
        mi_bodega.AgregarExistencias(10, "PAPEL");
        mi_bodega.AgregarExistencias(10, "PAPEL");
        mi_bodega.AgregarExistencias(6, "PAPEL");
        
        mi_bodega.AgregarExistencias(6, "PAPEL HIGIENICO");
        mi_bodega.AgregarExistencias(6, "PAPEL ROTULO");
        
        System.out.println("\n REPORTE DE EXISTENCIAS \n");
        mi_bodega.ReporteProductosExistencias();
    }
    
    
    
}
