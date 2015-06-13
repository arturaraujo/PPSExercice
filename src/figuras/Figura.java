package figuras;
import java.util.ArrayList;


public interface Figura {
	
	public double perimetro();
	public double area();
	public void desenha();
	public void add(Figura figura);
	public ArrayList<Figura> get();
	public void remove(Figura figura);

}
