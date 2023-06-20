public class Gerente extends Funcionario {
    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getBonificacion() {
        System.out.println("Llamando método del Gerente");
        return super.getBonificacion() + super.getSalario();
    }
    public boolean iniciarSesion(String clave) {
        if (this.clave == clave) {
            return true;
        } else {
            return false;
        }
    }

}
