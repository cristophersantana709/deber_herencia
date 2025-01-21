package deber_herencia;

public class Vehiculo {

	
	public String marca;
	public String modelo;
	public int anio;
	
	
	public Vehiculo(String marca, String modelo, int anio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	public void imprimir() {
		
		System.out.println("####### Vehiculo #######");
		System.out.println("Marca:" + this.marca +" "+ "Modelo:" + this.modelo +" "+ "Año:" + this.anio);
		System.out.println("El vehículo está encendido");
		System.out.println("El vehículo está apagado");
	}

	
}
