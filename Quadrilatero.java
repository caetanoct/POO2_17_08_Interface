
public abstract class Quadrilatero implements FormaGeo {
	public double[] lados = new double[4];

	public Quadrilatero(double lado1, double lado2, double lado3, double lado4) {
		this.lados[0] = lado1;
		this.lados[1] = lado2;
		this.lados[2] = lado3;
		this.lados[3] = lado4;
	}

	public double calcularPerimetro() {
		double perimetro = 0;
		for (int i = 0; i < 4; i++) {
			perimetro += lados[i];
		}
		return perimetro;
	}
}
