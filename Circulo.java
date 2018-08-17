
public class Circulo implements FormaGeo {
	public double raio;
	public Circulo(double raio) {
		this.raio = raio;
	}
	@Override
	public double calcularPerimetro() {
		double circ = 2 * 3.14 * raio;
		return circ;
	}

	@Override
	public double calcularArea() {
		double area = 3.14 * raio * raio;
		return area;
	}

}
