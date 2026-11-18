public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA INICIADO ===");

        CadastroUsuario cadastro = new CadastroUsuario();

        LoginUsuario login = new LoginUsuario();

        cadastro.cadastrar("João");

        login.realizarLogin("João");

        cadastro.cadastrar("Maria");

        System.out.println("=== SISTEMA ENCERRADO ===");
    }
}
