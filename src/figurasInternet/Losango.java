package figurasInternet;

public class Losango implements FiguraInternet {

	double base, altura;

	@Override
	public String desenharFigura() {
		return "Base: " + base + ". Atura: " + altura;
	}

	@Override
	public double area() {
		return base * altura / 2;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
