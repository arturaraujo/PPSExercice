package figuras;
import java.util.ArrayList;

import util.Reta;


public abstract class Triangulo implements Figura {

	private Reta r1,r2,r3;
	
	public Triangulo(Reta r1, Reta r2, Reta r3){
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
	}
	
	@Override
	public double area() {
		double p = (r1.getDouble() + r2.getDouble() + r3.getDouble())/2;
		return Math.sqrt(p*(p-r1.getDouble())*(p-r2.getDouble())*(p-r3.getDouble()));
	}
	
	@Override
	public double perimetro() {
		return r1.getDouble() + r2.getDouble() + r3.getDouble();
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
