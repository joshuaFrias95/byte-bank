public class TestFuncionario {
    public static void main(String[] args) {

        Funcionario diego = new Contador();
        diego.setNombre("Diego");
        diego.setDocumento("3344556677");
        diego.setSalario(2000d);
        diego.setTipo(0);

        System.out.println(diego.getSalario());
        System.out.println(diego.getBonificacion());
    }
}
