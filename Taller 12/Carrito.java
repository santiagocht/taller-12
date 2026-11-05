import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos;
    private EstrategiaDescuento estrategiaDescuento;

    public Carrito() {
        this.productos = new ArrayList<>();
        this.estrategiaDescuento = new SinDescuento();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void setEstrategiaDescuento(EstrategiaDescuento estrategiaDescuento) {
        this.estrategiaDescuento = estrategiaDescuento;
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (Producto p : productos) {
            subtotal += p.getPrecio();
        }
        return subtotal;
    }

    public double calcularTotal() {
        double subtotal = calcularSubtotal();
        double descuento = estrategiaDescuento.calcularDescuento(subtotal);
        return subtotal - descuento;
    }
}