public class Contador extends Funcionario {

    @Override
    public double getBonificacion() {
        System.out.println("Llamando método del Contador");
        return super.getBonificacion();
    }
}
