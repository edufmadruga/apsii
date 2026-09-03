import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o nome do livro: " );
		String nomeLivro = sc.nextLine();
		
		System.out.println("Insira o preço do livro: " );
		Double precoLivro = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insira o autor do livro: ");
		String autorLivro = sc.nextLine();
		
		Livro livro = new Livro(nomeLivro, precoLivro, autorLivro);
		
		System.out.println("Insira o nome do CD: " );
		String nomeCD = sc.nextLine();
		
		System.out.println("Insira o preço do CD: ");
		Double precoCD = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insira o Número de faixas do CD: ");
		int numFaixas = sc.nextInt();
		sc.nextLine();
		
		CD cd = new CD(nomeCD, precoCD, numFaixas);
		
		System.out.println("\nInformações do CD" );
		
		cd.exibeInformacoes();
		sc.close();;
		
	}

}
