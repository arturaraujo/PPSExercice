package figuras;
import java.util.ArrayList;

public interface Figura {
	
	public double perimetro();
	public double area();
	public String desenha();
	
	//Met�dos para a classe FiguraComposta
	public void add(Figura figura);
	public ArrayList<Figura> get();
	public void remove(Figura figura);

}
