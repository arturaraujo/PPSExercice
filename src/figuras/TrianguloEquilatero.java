package figuras;

import util.Reta;

public class TrianguloEquilatero extends Triangulo{
	
	public TrianguloEquilatero(Reta lado){
		super(lado,lado,lado);
	}

	@Override
	public String desenha() {
		
		return "Triangulo equilatero. Lado: " + super.getR1();
		//TODO implementar isso aqui!!
		
		
		//System.out.println(String.format("Figura Triângulo Equilátero: Lado: %d", ));
	}
	
}
