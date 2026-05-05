import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
        productos.add(new Producto("Teclado", 20.5));
        productos.add(new Producto("Ratón", 12.0));
    }

    public boolean buscarProducto(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
    
    public void listar() {
        for (Producto p : productos) {
            System.out.println(p.getNombre() + " - " + p.getPrecio() + "€");
        }
    }
}
