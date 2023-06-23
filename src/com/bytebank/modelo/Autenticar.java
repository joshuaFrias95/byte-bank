package com.bytebank.modelo;

public interface Autenticar {

    public void setClave(String clave);

    public boolean iniciarSesion(String clave);

}
