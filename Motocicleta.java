package deber_herencia;

public class Motocicleta extends Vehiculo{

	String tipoCasco;

	public Motocicleta(String marca, String modelo, int anio, String tipoCasco) {
		super(marca, modelo, anio);
		this.tipoCasco = tipoCasco;
	}
	
	@Override
	public void imprimir() {
	
	System.out.println("####### Motocicleta #######");
	System.out.println("Marca:" + this.marca +" "+ "Modelo:" + this.modelo +" "+ "Año:" + this.anio +" "+"Tipo de Casco:" + this.tipoCasco);
	System.out.println("El vehículo está encendido");
	System.out.println("La motocicleta está haciendo un caballito");
	System.out.println("El vehículo está apagado");
	System.out.println("");
	
	}
  
}


