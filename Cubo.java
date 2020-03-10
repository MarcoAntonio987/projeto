package projeto;

public class Cubo extends Retangulo implements Volume {
	private double largura;
	
	public Cubo(double base, double altura, double largura) {
		super(base, altura);
		this.largura = largura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double volume() {
		return getBase()*getAltura()*getLargura();
	}
	
	@Override
	public double area() {
		return (getBase()*getAltura())*6;
	}
	
	@Override
	public double perimetro() {
		return 12*getBase();
	}
	
	@Override
	public String toString() {
		return "Cubo [Base=" + getBase() + ", Altura=" + getAltura() + ", Largura=" + getLargura() + "]";
	}
		
	
	
	

}
