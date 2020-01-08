package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Auto;
import model.Moto;
import model.Vehiculo;

public class Main {

	public static void main(String[] args) {
		List<Vehiculo> vehiculos = new ArrayList<>();
		
		
		// Carga de los datos de los vehiculos
		vehiculos.add(new Auto("Peugeot", "206", 4, 200000));
		vehiculos.add(new Moto("Honda", "Titan", 125, 60000));
		vehiculos.add(new Auto("Peugeot", "208", 5, 250000));
		vehiculos.add(new Moto("Yamaha", "YBR", 160, 80500.50));
		
		
		// Mostrar datos de los vehiculos por consola
		for (Vehiculo v : vehiculos) {
			v.mostrarDatos();
		}
		
		System.out.println("=============================");
		
		/*
		 * Sort:
		 * Ordenamiento de los vehiculos por precio, utilizando el metodo Sort, que implica que la clase 
		 * vehiculos debe implementar la interfaz comparable e implementar el metodo compareTo() 
		 * para realizar la comparación.
		 *
		 **/ 
		
		Collections.sort(vehiculos);
		
		
		/*
		 * Como el array es ordenado de mas caro a mas barato entonces el primer y ultimo vehiculo poseen el mayor y menor precio respectivamente
		 */
		System.out.println("Vehículo más caro: " + vehiculos.get(0).getMarca() + " " + vehiculos.get(0).getModelo());
		System.out.println("Vehículo más barato: " + vehiculos.get(vehiculos.size()-1).getMarca() + " " + vehiculos.get(vehiculos.size()-1).getModelo());
		
		
		/*
		 * Contiene 'Y':
		 * Se procede a filtrar la lista de vehiculos y en los que el modelo tiene la letra "Y" se muestra el modelo y marca
		 * Se uso el metodo String format
		 * 
		 */
		vehiculos.stream().filter(v -> v.getModelo().contains("Y")).forEach(v -> 
			System.out.println("Vehiculo que contiene en el modelo la letra ´Y´: " + v.getMarca() + " " + v.getModelo() + " $" + String.format("%,.2f", v.getPrecio()))
		);
		
		System.out.println("=============================");
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		
		for (Vehiculo v : vehiculos) {
			System.out.println(v.getMarca() + " " + v.getModelo());
		}
	}

}
