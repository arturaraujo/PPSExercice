package figurasInternet;

public class Quadrado implements FiguraInternet {

	private double lado;
	
	public Quadrado() {
		// TODO Auto-generated constructor stub
	}
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public String desenharFigura() {
		return lado + "";
	}

	@Override
	public double area() {
		return lado * 2;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
