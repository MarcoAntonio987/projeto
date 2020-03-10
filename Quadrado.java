package projeto;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double lado) {
		super(lado, lado);
	}


	
	
	@Override
	public double diagonal() {
		return getAltura()*Math.sqrt(2);
	}

	@Override
	public double area() {
		return getAltura()*getBase();
	}
	@Override
	public double perimetro() {
	return getBase() + getBase() + getBase() + getBase();
	}
	
	
	
}
