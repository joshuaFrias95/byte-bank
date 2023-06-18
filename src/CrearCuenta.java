public class CrearCuenta {

    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.depositar(1000);

        System.out.println("Saldo primera cuenta: $" + primeraCuenta.getSaldo());

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.depositar(500);
        System.out.println("Saldo segunda cuenta: $" + segundaCuenta.getSaldo());

    }
}
