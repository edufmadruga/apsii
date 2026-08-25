public class FuncionarioCLT extends Funcionario {
	protected double valeTransporte;
	protected double valeAlimentacao;
	
	public FuncionarioCLT(String nome, String matricula, double salarioBase, String dataAdmissao, 
	double valeTransporte, double valeAlimentacao) {
		super(nome, matricula, salarioBase, dataAdmissao);
		this.valeTransporte = valeTransporte;
		this.valeAlimentacao = valeAlimentacao;	
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + this.valeTransporte + this.valeAlimentacao;
	}

	@Override
	public double calcularDesconto() {
		return super.calcularDesconto() + 50;
	}	
	@Override
	public String toString() {
		return super.toString() + "\nVale Transporte: R$ " + valeTransporte + "\nVale Alimentação: R$ " + valeAlimentacao;
	}
}
