package projeto;

public class Cilindro extends Circulo implements Volume {
	private double altura;

	public Cilindro(double raio, double altura) {
		super(raio);
		this.altura=altura;
	}
	

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	public double volume() {
		return Math.PI * Math.pow(raio, 3) * getAltura();
	}
	
	
	@Override
	public double area() {
		return (2*(Math.PI * Math.pow(raio, 2)))+(2*Math.PI *getRaio() *getAltura());
	}
	
	@Override
	public double perimetro() {
		return 2*Math.PI *getRaio();
	}
	
	@Override
	public String toString() {
		return "Cilindro [Raio=" + getRaio() + ", Altura=" + getAltura() + "]";
	}
	

}
