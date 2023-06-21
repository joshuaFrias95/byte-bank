public class CuentaCorriente  extends Cuenta {
    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean transferir(double valor, Cuenta cuenta) {
        double comision = 0.2d;
        return super.transferir(valor + comision, cuenta);
    }
}
