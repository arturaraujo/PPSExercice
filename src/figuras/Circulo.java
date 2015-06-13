package figuras;
import java.util.ArrayList;

import util.Reta;


public class Circulo implements Figura{

	private Reta raio;
	
	public Circulo(Reta raio){
		this.raio = raio;
	}
	
	public Reta getRaio() {
		return raio;
	}

	public void setRaio(Reta raio) {
		this.raio = raio;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * raio.getDouble();
	}

	@Override
	public double area() {
		double r = raio.getDouble();
		return Math.PI * r * r;
	}

	@Override
	public String desenha() {
		return String.format("Figura Círculo: Raio Ponto1%f - Ponto2%f",raio.getP1().toString(),raio.getP2().toString());
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
