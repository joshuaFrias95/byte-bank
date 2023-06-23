package com.bytebank.modelo;

public abstract class Cuenta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total = 0;


    public static int getTotal() {
        return Cuenta.total;
    }

    public Cuenta() {}

    public Cuenta(int agencia, int numero) {
        if (agencia <= 0) {
            System.out.println("No se permite 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
        total++;
        System.out.println("Se creó la cuenta número " + total);
    }

    public abstract void depositar(double valor);

    public void retirar(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
        this.saldo -= valor;
    }

    public boolean transferir(double valor, Cuenta cuenta) {

        if (this.saldo >= valor) {
            try {
                this.retirar(valor);
            } catch (SaldoInsuficienteException e) {
                throw new RuntimeException(e);
            }
            this.saldo -= valor;
            cuenta.saldo += valor;
            return true;
        } else {

            return false;
        }
    }

    //Método getter

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return this.saldo;
    }



    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}