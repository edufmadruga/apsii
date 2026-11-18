public class LoginUsuario {

    private GerenciadorLog log;

    public LoginUsuario() {
        log = GerenciadorLog.getInstancia();
    }

    public void realizarLogin(String nome) {

        System.out.println("Realizando login: " + nome);

        log.registrar("Login realizado: " + nome);
    }
}
