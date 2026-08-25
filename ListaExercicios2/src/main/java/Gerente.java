public class Gerente extends FuncionarioCLT{
	protected int tamanhoEquipe;
	protected double percentualBonus;
	
	public Gerente(String nome, String matricula, double salarioBase, String dataAdmissao, 
	double valeTransporte, double valeAlimentacao, int tamanhoEquipe, double percentualBonus) {
	
	super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
	this.tamanhoEquipe = tamanhoEquipe;
	this.percentualBonus = percentualBonus;
	
	}
	@Override
	public double calcularSalario() {
		double salarioCLT = super.calcularSalario();
		
		double bonus = salarioBase * percentualBonus;
		return salarioCLT + bonus;
	}
	@Override
	public double calcularDesconto() {
		double desconto = super.calcularDesconto();
		if(tamanhoEquipe > 10) {
			desconto += 100;
		}
		return desconto;
	}
	@Override
	public String toString() {
		return super.toString() + "\nTamanho da equipe: " + tamanhoEquipe + "\nPercentual de bônus: " + percentualBonus;
	}

}

