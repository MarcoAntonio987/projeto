package projeto;

public abstract class Poligono extends Figura {
	private double base,altura;

	public Poligono(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Quadrado [base=" + base + ", altura=" + altura + "]";
	}

}
