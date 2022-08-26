public class CalcularImpuesto {
    public static void main(String[] args) {
        double precioProducto = 200.25;
        System.out.println("Precio del produto sin Imp: " + precioProducto);
        System.out.println("Precio del producto con Imp: " + calcularImp(precioProducto));

    }

    private static double calcularImp(double precio) {
        precio = precio * 1.18;
        return precio;
    }
}
