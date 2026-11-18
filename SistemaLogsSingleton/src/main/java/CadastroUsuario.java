public class CadastroUsuario {

    private GerenciadorLog log;

    public CadastroUsuario() {
        log = GerenciadorLog.getInstancia();
    }

    public void cadastrar(String nome) {

        System.out.println("Cadastrando usuário: " + nome);

        log.registrar("Usuário " + nome + " cadastrado.");
    }
}
