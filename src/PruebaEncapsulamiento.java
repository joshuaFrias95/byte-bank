public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setNombre("Diego");
        cliente.setDocumento("Fsse34dg");

        cuenta.setTitular(cliente);

        System.out.println(cliente);
        System.out.println(cuenta.getTitular());
    }
}
