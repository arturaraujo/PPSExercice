package main;

import util.Ponto;
import util.Reta;
import figuras.Figura;
import figuras.FiguraComposta;
import figuras.QuadradoAdapter;
import figuras.TrianguloEquilatero;

public class Manipulacao {
	
	public static void main(String args[]){
		Reta reta = new Reta(new Ponto(0, 3), new Ponto(3, 6));
		
		Figura quadrado = new QuadradoAdapter(2);
		Figura triangulo = new TrianguloEquilatero(reta);
		
		Figura composta = new FiguraComposta();
		composta.add(quadrado);
		composta.add(triangulo);
		
		System.out.println(composta.desenha());
	}
}
