public class SistemaInterno {
        private String clave = "AluraCursosOnline";

    public String getClave() {
        return clave;
    }

    public boolean autenticar(Autenticar gerente) {
        boolean puedeIniciarSesion = gerente.iniciarSesion(getClave());

        if (puedeIniciarSesion) {
            System.out.println("Login exitoso");
            return true;
        } else {
            System.out.println("Error en login");
            return false;
        }
    }
}
