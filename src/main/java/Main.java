import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("MiniInventario iniciado correctamente.");

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Listar productos");
            System.out.println("2. Buscar producto");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    inventario.listar();
                    break;
                case 2:
                    System.out.print("Nombre del producto: ");
                    String buscar = sc.nextLine();
                    if (inventario.buscarProducto(buscar)) {
                        System.out.println("¡Producto encontrado!");
                    } else {
                        System.out.println("El producto no existe en el inventario.");
                    }
                    break;
                case 3:
                    System.out.println("Adiós.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }
}
