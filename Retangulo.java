
public class Retangulo extends Quadrilatero implements FormaGeo {

	public Retangulo(double base, double altura) {
		super(base, altura, base, altura);
		
	}
	
	@Override
	public double calcularArea() {
		double area;
		area = this.lados[0] * this.lados[1];
		return area;
	}

}
