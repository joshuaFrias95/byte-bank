package com.bytebank.modelo;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void retirar(double valor) throws SaldoInsuficienteException {
        double comision = 0.2;
        super.retirar(valor + comision);
    }

    @Override
    public boolean transferir(double valor, Cuenta cuenta) {
        double comision = 0.2d;
        return super.transferir(valor + comision, cuenta);
    }
}
