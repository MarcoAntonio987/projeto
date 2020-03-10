package projeto;

public class Losango extends Poligono {

private double lado;
	public Losango(double base, double altura,double lado ) {
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
	public double perimetro() {
	return getLado() + getLado() + getLado() + getLado();
	}
	

	@Override
	public String toString() {
		return "Losango [Diagonal_maior=" + getBase() + ", Diagonal_menor=" + getAltura() + ", Lado=" + getLado() +"]";
	}

}
