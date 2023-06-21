public class Gerente extends Funcionario {
    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getBonificacion() {
        System.out.println("Llamando método del Gerente");
        return super.getSalario() + (super.getSalario() * 0.05);
    }
    public boolean iniciarSesion(String clave) {
        if (this.clave == clave) {
            return true;
        } else {
            return false;
        }
    }

}
