public class TestReferencias {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Diego");

        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");

        funcionario.setSalario(2000d);
        gerente.setSalario(10000d);

        gerente.iniciarSesion("_ddddd");
    }
}
