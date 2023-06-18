public class TestReferencia {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego");
        diego.setDocumento("3344556677");
        diego.setTelefono("2233445566");

        Cuenta cuentaDiego = new Cuenta();
        cuentaDiego.setAgencia(1);
        cuentaDiego.titular = diego;

        System.out.println(cuentaDiego.titular.getDocumento());
        System.out.println(cuentaDiego.titular);
        System.out.println(diego);


    }
}
