package com.bytebank.modelo;

public class Gerente extends Funcionario implements Autenticar {

    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }

    @Override
    public double getBonificacion() {
        System.out.println("Llamando método del com.bytebank.test.modelo.Gerente");
        return 2000;
    }
}
