package Solucion;

import Objetos.Bodega;

/**
 *
 * @author Cardona
 */
public class SistemaManejoInventarios {
    
    Bodega bodega1 = new Bodega();

    public SistemaManejoInventarios() {
    }
    
    public void IniciarSistema(){
        // Agregar productos
        bodega1.AgregarProductos(10.1, "shampoo");
        bodega1.AgregarProductos(10.1, "papel");
        
        // Agregar Existencias
        
        bodega1.AgregarExistencias("shampoo", 10);
        bodega1.AgregarExistencias("shampoo", 20);
        bodega1.AgregarExistencias("papel", 5);
        bodega1.AgregarExistencias("papel", 2);
        bodega1.AgregarExistencias("papel", 15);
        bodega1.AgregarExistencias("lapiz", 100);
        
        // Reportes
        bodega1.ReporteExistencias();
    }
    
}
