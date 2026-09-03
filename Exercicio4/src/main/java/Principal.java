public class Principal {

	public static void main(String[] args) {
		GerenteDeFiguras gerente = new GerenteDeFiguras();
		
		Triangulo t1 = new Triangulo(2.5, 3.4);
		gerente.adicionaFigura(t1);

		Losango l1 = new Losango(3.0, 5.0);
		Losango l2 = new Losango(4.0, 6.0);
		
		gerente.adicionaFigura(l1);
		gerente.adicionaFigura(l2);
		
		gerente.imprimeFigura();
		
		System.out.println("Área total: " + gerente.getArea());
	}
}
