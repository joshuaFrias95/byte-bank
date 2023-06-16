public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta();
        miCuenta.saldo = 300;
        miCuenta.depositar(200);

        System.out.println(miCuenta.saldo);

        miCuenta.retirar(100);
        System.out.println(miCuenta.saldo);

        Cuenta suCuenta = new Cuenta();
        System.out.println(miCuenta.saldo);

        suCuenta.depositar(1000);
        System.out.println(suCuenta.saldo);

        boolean puedeTransferir = suCuenta.transferir(400, miCuenta);
        if (puedeTransferir) {

            System.out.println("Transferencia exitosa");
        }


        System.out.println(miCuenta.saldo);
        System.out.println(suCuenta.saldo);
    }

}
