package deber_herencia;

public class main {

public static void main(String[] args) {
		
		Auto obj1 = new Auto("toyota", "Corolla", 2022, 4);
		obj1.imprimir();
		
		Motocicleta obj2 = new Motocicleta("Kawasaki", "Ninja", 2020, "Mondular");
		obj2.imprimir();
		
		Camion obj3 = new Camion("Volvo", "FH", 2018, 26);
		obj3.imprimir();
		
	}

}
