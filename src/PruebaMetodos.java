public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta();
        miCuenta.depositar(300);
        miCuenta.depositar(200);

        System.out.println(miCuenta.getSaldo());

        miCuenta.retirar(100);
        System.out.println(miCuenta.getSaldo());

        Cuenta suCuenta = new Cuenta();
        System.out.println(miCuenta.getSaldo());

        suCuenta.depositar(1000);
        System.out.println(miCuenta.getSaldo());

        boolean puedeTransferir = suCuenta.transferir(400, miCuenta);
        if (puedeTransferir) {

            System.out.println("Transferencia exitosa");
        }


        System.out.println(miCuenta.getSaldo());
        System.out.println(suCuenta.getSaldo());
    }

}
