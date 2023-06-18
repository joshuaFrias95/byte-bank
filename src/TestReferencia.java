public class TestReferencia {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego");
        diego.setDocumento("3344556677");
        diego.setTelefono("2233445566");

        Cuenta cuentaDiego = new Cuenta(1);
        cuentaDiego.setAgencia(1);
        cuentaDiego.setTitular(diego);

        System.out.println(cuentaDiego.getTitular().getDocumento());
        System.out.println(cuentaDiego.getTitular());
        System.out.println(diego);


    }
}
