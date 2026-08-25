public class Estagiario extends Funcionario{
	protected double valorBolsaAuxilio;
	protected int cargaHorariaSemanal;
	
	public Estagiario(String nome, String matricula, double salarioBase, String dataAdmissao, 
					double valorBolsaAuxilio, int cargaHorariaSemanal) {
		super(nome, matricula, salarioBase, dataAdmissao);
		this.valorBolsaAuxilio = valorBolsaAuxilio;
		this.cargaHorariaSemanal = cargaHorariaSemanal;
	}
	@Override
	public double calcularSalario() {
		return valorBolsaAuxilio;
	}
	@Override
	public double calcularDesconto() {
		return 0;
	}
	@Override
	public String toString() {
		return super.toString() + "\nBolsa auxílio: R$" + valorBolsaAuxilio + "\nCarga horária Semanal: "
				+ cargaHorariaSemanal;
	}

}
