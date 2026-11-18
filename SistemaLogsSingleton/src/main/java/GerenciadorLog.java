import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GerenciadorLog {

    private static final GerenciadorLog instancia =
        new GerenciadorLog();

    private GerenciadorLog() {
        System.out.println("Gerenciador de log criado!");
    }

    public static GerenciadorLog getInstancia() {
        return instancia;
    }

    public void registrar(String mensagem) {

        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formato =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String data = agora.format(formato);

        System.out.println("[" + data + "] " + mensagem);
    }
}
