public class CD extends Produto implements InfoGerais{
	private int numFaixas;
	
	public CD(String nome, double preco, int numFaixas) {
		super(nome, preco);
		this.numFaixas = numFaixas;
	}
	public int getNumFaixas() {
		return numFaixas;
	}
	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}
	
	@Override
	public void exibeInformacoes() {
		System.out.println("Nome do CD: " + getNome() + "\nPreço do CD: " + getPreco() + 
				"\nNúmero de faixas: " + getNumFaixas());
	}
}
