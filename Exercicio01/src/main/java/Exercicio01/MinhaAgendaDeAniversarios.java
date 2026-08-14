package Exercicio01;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {
	
	private ArrayList<Aniversariante> aniversariantes;
	
	public MinhaAgendaDeAniversarios () {
		aniversariantes = new ArrayList<>();
	}
	
	@Override
	public void adicionarAniversariante(String nome, int dia, int mes) {
		aniversariantes.add(new Aniversariante(nome, dia, mes));
	}
	@Override 
	public ArrayList<String> obterAniversariantesDoDia(int dia, int mes){
		
		ArrayList<String> nomes = new ArrayList<>();
		
		for (Aniversariante a : aniversariantes) {
			DataAniversario data = a.getDataAniversario();
			
			if(data.getDia() == dia && data.getMes() == mes) {
				nomes.add(a.getNome());
			}
		}
		return nomes;
	}	
	
	@Override
	public void removerAniversariante(String nomeAniversariante) {
		
		for (int i = 0; i < aniversariantes.size(); i++) {
			if (aniversariantes.get(i).getNome().equals(nomeAniversariante)) {
				aniversariantes.remove(i);
				i--;
			}
		}
	}
}
