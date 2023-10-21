package org.example.ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Facturaciom1 {
	record Factura(String cliente, LocalDate fechaFactura, List<Double> precioProducto) {
	}

	public static void main(String[] args) {
		Factura factura1 = new Factura("Maria Sanabria", LocalDate.parse("01/07/1999", DateTimeFormatter.ofPattern("dd/MM/uuuu")), List.of(4500D, 5000D, 2500D));
		Factura factura2 = new Factura("Juan Perez", LocalDate.parse("15/08/2000", DateTimeFormatter.ofPattern("dd/MM/uuuu")), List.of(3500D, 6000D, 2800D));
		double totalValorFactura1 , totalValorFactura2;

		totalValorFactura1 = calcularFactura(factura1);
		totalValorFactura2 = calcularFactura(factura2);
		System.out.println("Factura 1 \nFecha: "+factura1.fechaFactura()+ "\nCliente: "+ factura1.cliente()+"\nTotal: "+ totalValorFactura1);
		System.out.println("\nFactura 2 \nFecha: "+factura1.fechaFactura()+ "\nCliente: "+ factura2.cliente()+"\nTotal: "+ totalValorFactura2);

	}
	static double calcularFactura(Factura factura) {
		double totalValorFactura = 0D;
		for (Double precio : factura.precioProducto) {
			totalValorFactura += precio;
		}
		return totalValorFactura;
	}

}
