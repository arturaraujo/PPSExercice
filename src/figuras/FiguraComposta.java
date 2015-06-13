package figuras;
import java.util.ArrayList;


public class FiguraComposta implements Figura {

	private ArrayList<Figura> figuras;
	
	public FiguraComposta() {
		this.figuras = new ArrayList<Figura>();
	}
	
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<Figura> getFiguras() {
		return figuras;
	}

	public void setFiguras(ArrayList<Figura> figuras) {
		this.figuras = figuras;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String desenha() {
		StringBuffer string = new StringBuffer("Figuras: \n");
		for (Figura f :this.figuras){
			string.append(f.desenha() + "\n");
		}
		return string.toString();
	}

	@Override
	public void add(Figura figura) {
		figuras.add(figura);
	}

	@Override
	public ArrayList<Figura> get() {
		return figuras;
	}

	@Override
	public void remove(Figura figura) {
		figuras.remove(figura);
	}

}
