package figuras;

import java.util.ArrayList;

import figurasInternet.FiguraInternet;
import figurasInternet.Losango;

public class LosangoAdapter implements Figura{
	
	FiguraInternet losango;
	
	public LosangoAdapter() {
		this.losango = new Losango();
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area() {
		return this.losango.area();
	}

	@Override
	public void desenha() {
		this.losango.desenharFigura();
	}

	@Override
	public void add(Figura figura) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Figura> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Figura figura) {
		// TODO Auto-generated method stub
		
	}
	
	
}
