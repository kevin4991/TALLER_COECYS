package Objetos;

/**
 * @author Cardona
 */
public class Bodega {

    Producto[] mi_bodega = new Producto[100];
    int indice = 0;

    public Bodega() {
    }

    public void AgregarProductos(double precio, String nombre) {
        if (indice < 100) {
            mi_bodega[indice] = new Producto(precio, nombre);
            indice++;
        } else {
            System.out.println("YA NO HAY ESPACIO PARA MAS PRODUCTOS!!");
        }
    }

    public void AgregarExistencias(String nombre, int cantidad) {

        int indice_buscado = -1;
        // BUSCA UN PRODUCT O POR MEDIO DE SU NOMBRE
        for (int i = 0; i < 100; i = i + 1) {
            Producto producto_pivote = mi_bodega[i];
            if (producto_pivote != null) {
                if (producto_pivote.getNombre().equals(nombre)) {
                    // YA ENCONTRE EL PRODUCTO
                    indice_buscado = i;
                    break;
                }
            }
        }
        
        if(indice_buscado != -1){
            Producto producto_buscado = mi_bodega[indice_buscado];
            producto_buscado.setExistencia(producto_buscado.getExistencia() + cantidad);
            System.out.println("EXISTENCIA AGREGADA: " + nombre + " ° " + cantidad);
        }else{
            System.out.println("EL PRODUCTO NO EXISTE, NO SE AGREGO EXISTENCIA: " + nombre);
        }

    }

    public void ReporteExistencias() {
        for (int i = 0; i < 100; i = i + 1) {
            Producto producto_pivote = mi_bodega[i];
            if (producto_pivote != null) {
                System.out.println("Producto: " + producto_pivote.getNombre() + " | " + producto_pivote.getExistencia() + " | " + producto_pivote.getPrecio());
            }
        }
    }

}
