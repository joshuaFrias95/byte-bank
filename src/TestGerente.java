public class TestGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        //gerente.setSalario(5000d);
        //Funcionario gerente = new Funcionario();
        gerente.setSalario(6000d);
        gerente.setClave("AluraCursosOnline");
        gerente.setTipo(1);
        System.out.println(gerente.iniciarSesion("AluraCursosOnline"));
        System.out.println(gerente.getBonificacion());
    }
}
