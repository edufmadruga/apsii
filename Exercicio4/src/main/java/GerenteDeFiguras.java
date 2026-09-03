import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
	private List<FiguraGeometrica> figuras;
	public GerenteDeFiguras() {
		figuras = new ArrayList<FiguraGeometrica>();
	}
	
	public void adicionaFigura(FiguraGeometrica figura) {
		figuras.add(figura);
	}
	
	public void imprimeFigura() {
		for(FiguraGeometrica figura : figuras) {
			System.out.println(figura.getNomeFigura());
		}
	}
	public double getArea() {
		double areaTotal = 0;
		
		for (FiguraGeometrica figura : figuras) {
			areaTotal += figura.calculaArea();
		}
		return areaTotal;
	}
}

