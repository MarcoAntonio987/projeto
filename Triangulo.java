package projeto;

public class Triangulo extends Poligono {
	private double lado;
	
	public Triangulo(double base, double altura, double lado) {
		super(base, altura);
		this.lado=lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	@Override
	public double area() {
	return (getBase()*getAltura())/2;
	}
	
	@Override
	public String toString() {
		return "Triangulo [Base=" + getBase() + ", Altura=" + getAltura() + ", Lado =" + getLado() + "]";
	}
	
	@Override
	public double perimetro() {
		return getLado() + getLado() + getLado() ;
	}
	

	
}
