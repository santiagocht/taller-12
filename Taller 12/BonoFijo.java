public class BonoFijo implements EstrategiaDescuento {
    private double montoFijo;

    public BonoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double calcularDescuento(double subtotal) {
        if (montoFijo > subtotal) {
            return subtotal;
        }
        return montoFijo;
    }
}