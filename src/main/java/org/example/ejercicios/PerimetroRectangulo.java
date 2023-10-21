package org.example.ejercicios;

public class PerimetroRectangulo {
	record Rectangulo(double base, double altura) {}
	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo(4.0, 6.0);
		double perimetro;
		perimetro = calcularPerimetroRectangulo(rectangulo);
		System.out.println("El perímetro del rectángulo es: " + perimetro);
	}
	static double calcularPerimetroRectangulo(Rectangulo rectangulo) {
		double base, altura;
		base = rectangulo.base();
		altura = rectangulo.altura();
		return (base + altura)*2;
	}
}

