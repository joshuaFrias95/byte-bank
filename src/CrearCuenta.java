public class CrearCuenta {

    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(2);
        primeraCuenta.depositar(1000);

        System.out.println("Saldo primera cuenta: $" + primeraCuenta.getSaldo());

        Cuenta segundaCuenta = new Cuenta(4);
        segundaCuenta.depositar(500);
        System.out.println("Saldo segunda cuenta: $" + segundaCuenta.getSaldo());

    }
}
