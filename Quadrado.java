
public class Quadrado extends Quadrilatero{

	public Quadrado(double lado) {
		super(lado, lado, lado, lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularArea() {
		double area = lados[0] * lados[1];
		return area;
	}

}
