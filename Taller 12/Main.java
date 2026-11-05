public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Camisa", 50000);
        Producto p2 = new Producto("Jeans", 100000);

        Carrito carrito = new Carrito();
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);

        System.out.println("Subtotal: " + carrito.calcularSubtotal());

        // Aplicando descuento de estudiante
        carrito.setEstrategiaDescuento(new DescuentoEstudiante(0.10));
        System.out.println("Total con descuento estudiante: " + carrito.calcularTotal());

        // Cambiando a bono fijo
        carrito.setEstrategiaDescuento(new BonoFijo(20000));
        System.out.println("Total con bono fijo: " + carrito.calcularTotal());
    }
}