import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	


	public static void imprimirDadosRetangulos(ArrayList<Retangulo> array) {
		for(int i = 0 ; i < array.size() ; i++) {
			System.out.println("Base:"+array.get(i).lados[0]);
			System.out.println("Altura:"+array.get(i).lados[1]);
			System.out.println("Area:" + array.get(i).calcularArea());
			System.out.println("Perimetro:"+ array.get(i).calcularPerimetro());
			System.out.println("");
		}
	}
	
	public static void imprimirDadosQuadrados(ArrayList<Quadrado> array) {
		for(int i = 0 ; i < array.size() ; i++) {
			System.out.println("Lado:"+array.get(i).lados[0]);
			System.out.println("Area:" + array.get(i).calcularArea());
			System.out.println("Perimetro:"+ array.get(i).calcularPerimetro());
			System.out.println("");
		}
	}
	
	public static void imprimirDadosCirculos(ArrayList<Circulo> array) {
		for(int i = 0 ; i < array.size() ; i++) {
			System.out.println("Raio:"+array.get(i).raio);
			System.out.println("Area:" + array.get(i).calcularArea());
			System.out.println("Perimetro:"+ array.get(i).calcularPerimetro());
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantas formas você deseja criar?"));

		String[] formas = { "Retângulo", "Quadrado", "Círculo" };

		ArrayList<Retangulo> Retangulos = new ArrayList<Retangulo>();
		ArrayList<Quadrado> Quadrados = new ArrayList<Quadrado>();
		ArrayList<Circulo> Circulos = new ArrayList<Circulo>();

		for (int i = 0; i < qnt; i++) {
			int opt = JOptionPane.showOptionDialog(null, "Qual forma você deseja criar?", "Menu", 0, 0, null, formas,
					null);
			switch (opt) {
			case 0:
				double base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base"));
				double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
				Retangulo umRetangulo = new Retangulo(base, altura);
				Retangulos.add(umRetangulo);
				break;
			case 1:
				double lado = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado"));
				Quadrado umQuadrado = new Quadrado(lado);
				Quadrados.add(umQuadrado);
				break;
			case 2:
				double raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio"));
				Circulo umCirculo = new Circulo(raio);
				Circulos.add(umCirculo);
				//Comparacao x objeto é do mesmo tipo que y objeto?
				Circulo a = new Circulo(2);
				if(umCirculo.getClass().equals(a.getClass())) {
					System.out.println("É UM CIRCULO");
				}
				break;

			}
		}
		System.out.println("Retangulos: \n");
		imprimirDadosRetangulos(Retangulos);
		System.out.println("Quadrados: \n");
		imprimirDadosQuadrados(Quadrados);
		System.out.println("Circulos: \n");
		imprimirDadosCirculos(Circulos);
		
	}

}
