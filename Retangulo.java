package projeto;

public class Retangulo extends Poligono implements Diagonal {

		public Retangulo(double base, double altura) {
			super(base, altura);
		}

		@Override
		public double area() {
			return getBase()*getAltura();
		}

		@Override
		public String toString() {
			return "Retangulo [Base=" + getBase() + ", Altura=" + getAltura() + "]";
		}

		@Override
		public double diagonal() {
			return Math.sqrt(Math.pow(getBase(),2)+Math.pow(getAltura(),2));
		}
		@Override
		public double perimetro() {
		return getBase() + getBase() + getAltura() + getAltura();
		}
		

	}


