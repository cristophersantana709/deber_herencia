package deber_herencia;

public class Camion extends Vehiculo{
	
	int capacidadCarga;

	public Camion(String marca, String modelo, int anio, int capacidadCarga) {
		super(marca, modelo, anio);
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public void imprimir() {
	
	System.out.println("####### Camion #######");
	System.out.println("Marca:" + this.marca +" "+ "Modelo:" + this.modelo +" "+ "Año:" + this.anio +" "+"La capacidad de carga es:" + this.capacidadCarga);
	System.out.println("El vehículo está encendido");
	System.out.println("El camión está descargando");
	System.out.println("El vehículo está apagado");
	System.out.println("");
	
	}
	
}


