package model;

public class Moto extends Vehiculo {
	private int cilindrada;

	/*
	 *  Constructor Moto
	 */
	
	public Moto(String marca, String modelo, int cilindrada, double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(super.toString() + " // Cilindrada: " + this.cilindrada + "c // Precio: $" +  String.format("%,.2f", super.getPrecio()));
	}
	

}
