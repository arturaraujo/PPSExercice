package figuras;

import java.util.ArrayList;

import figurasInternet.Quadrado;

public class QuadradoAdapter implements Figura{

	Quadrado quadrado;
	
	public QuadradoAdapter() {
		this.quadrado = new Quadrado();
	}
	
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area() {
		return this.quadrado.area();
	}

	@Override
	public String desenha() {
		return this.quadrado.desenharFigura();
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
