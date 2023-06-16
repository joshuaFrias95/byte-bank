public class CrearCuenta {

    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 1000;

        System.out.println("Saldo primera cuenta: " + primeraCuenta.saldo);

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 500;
        System.out.println("Saldo segunda cuenta: " + segundaCuenta.saldo);
    }
}
