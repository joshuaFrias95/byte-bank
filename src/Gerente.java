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
        System.out.println("Llamando método del Gerente");
        return 2000;
    }
}
