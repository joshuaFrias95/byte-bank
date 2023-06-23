package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.SaldoInsuficienteException;

public class TestCuentaExceptionSaldo {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123, 456);
        cuenta.depositar(200);
        try {
            cuenta.retirar(220);
            cuenta.retirar(10);
        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e);
        }

    }
}
