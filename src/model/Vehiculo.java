package model;
import java.lang.Double; 

public abstract class Vehiculo implements IVehiculo, Comparable<Vehiculo> {
	private String marca;
	private String modelo;
	private double precio;
	
	/*
	 *  Getters & Setters
	 */
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/*
	 *  Constructor Vehiculo
	 */

	public Vehiculo(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + " // Modelo: " + modelo;
	}
	
	@Override
	public int compareTo(Vehiculo o) {
		return Double.compare(o.getPrecio(), this.getPrecio());
	}

	
}
