
// Importar librerías necesarias
package imprimirordencompragui;
import javax.swing.JOptionPane;

// Declarar la clase principal del programa
public class ImprimirOrdenCompraGUI {

    // Método principal del programa
    public static void main(String[] args) {
        
        // Declarar variables
        String nombreArticulo; // nombre del artículo comprado
        double precio; // precio de compra del artículo
        int cant; // número de elementos comprados
        
        // Solicitar al usuario los datos de la orden de compra
        nombreArticulo = JOptionPane.showInputDialog("Nombre del artículo comprado:");
        cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));
        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio unitario:"));
        
        // Calcular el precio total de la orden de compra
        double precioTotal = precio * cant;
        
        // Mostrar la orden de compra en una ventana de diálogo
        JOptionPane.showMessageDialog(null, "ORDEN DE COMPRA:\n\n"
                + "Artículo: " + nombreArticulo + "\nCantidad: " + cant
                + "\nPrecio total: $" + precioTotal);
    }
}

