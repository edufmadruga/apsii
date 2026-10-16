import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Aluguel> alugueis = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public String extrato() {
    	double valorTotal = 0;
    	int pontosTotais = 0;

    	String resultado = "Registro de Alugueis de "
            + getNome() + "\n";

    	for (Aluguel aluguel : alugueis) {
    		double valor = aluguel.calcularValor();

    		pontosTotais += aluguel.calcularPontos();
    		valorTotal += valor;

    		resultado += "\t"
                + aluguel.getFita().getTitulo()
                + "\t" + valor + "\n";
    }

    resultado += "Valor total devido: "
            + valorTotal + "\n";

    resultado += "Você ganhou "
            + pontosTotais
            + " pontos de alugador frequente";

    return resultado;
}
}