package model;

public class Auto extends Vehiculo {
	private int nroDePuertas;
	
	/*
	 *  Constructor Auto
	 */

	public Auto(String marca, String modelo, int nroDePuertas, double precio) {
		super(marca, modelo, precio);
		this.nroDePuertas = nroDePuertas;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(super.toString() + " // Puertas: " + this.nroDePuertas + " // Precio: $" +  String.format("%,.2f", super.getPrecio()));
	}

	
}
