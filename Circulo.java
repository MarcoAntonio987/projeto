package projeto;

public class Circulo extends Figura {
	public double raio;
	
	
	public Circulo(double raio) {
		this.raio = raio;
	
	}
	
 

	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	@Override
	public double perimetro() {
		return 2*Math.PI *raio;
	}


	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}

}