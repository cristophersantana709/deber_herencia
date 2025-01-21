package deber_herencia;

public class Auto extends Vehiculo{
	
	int numeroPuerta;

	public Auto(String marca, String modelo, int anio, int numeroPuerta) {
		super(marca, modelo, anio);
		this.numeroPuerta = numeroPuerta;
	}
	
		@Override
		public void imprimir() {
		
		System.out.println("####### Auto #######");
		System.out.println("Marca:" + this.marca +" "+ "Modelo:" + this.modelo +" "+ "Año:" + this.anio +" "+"Numero de puerta:" + this.numeroPuerta);
		System.out.println("El vehículo está encendido");
		System.out.println("El maletero está abierto");
		System.out.println("El vehículo está apagado");
		System.out.println("");
		
		}
	

}
