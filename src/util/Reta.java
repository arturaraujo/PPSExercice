package util;

public class Reta {

	private Ponto p1;
	private Ponto p2;
	
	public Reta() {
		// TODO Auto-generated constructor stub
	}
	
	public Reta(Ponto ponto1, Ponto ponto2) {
		this.p1 = ponto1;
		this.p2 = ponto2;
	}
	
	public Ponto getP1() {
		return p1;
	}
	public void setP1(Ponto p1) {
		this.p1 = p1;
	}
	public Ponto getP2() {
		return p2;
	}
	public void setP2(Ponto p2) {
		this.p2 = p2;
	}
	
	public double getDouble(){
		return Math.sqrt((Math.pow((p2.getX()-p1.getX()),2)) + (Math.pow((p2.getY()-p1.getY()),2)));
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ponto1:%s. Ponto2: %s.", p1, p2);
	}
	
}
