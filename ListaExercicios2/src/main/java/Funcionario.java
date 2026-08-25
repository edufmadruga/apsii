public class Funcionario {
	protected String nome;
	protected String matricula;
	protected double salarioBase;
	protected String dataAdmissao;
	
	public Funcionario(String nome, String matricula, double salarioBase, String dataAdmissao) {
		this.nome = nome;
		this.matricula = matricula;
		this.salarioBase = salarioBase;
		this.dataAdmissao = dataAdmissao;
	}
	
	public double calcularSalario() {
		return salarioBase;
	}
	public double calcularDesconto() {
		return 0.08*salarioBase;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + "\nMatrícula: " + matricula + "\nSalário Base: R$ " + salarioBase +
				"\n Data de admissão: " + dataAdmissao + "\nSalário: R$ " + calcularSalario() + "\nDesconto: R$"
				+ calcularDesconto();
	}
}

