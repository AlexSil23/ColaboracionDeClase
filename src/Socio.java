/*Plantear una clase Club y otra clase Socio.
La clase Socio debe tener los siguientes atributos privados: nombre y la antigüedad en el club (en años). 
En el constructor pedir la carga del nombre y su antigüedad. La clase Club debe tener como atributos 
3 objetos de la clase Socio. Definir una responsabilidad para imprimir el nombre del socio con mayor 
antigüedad en el club.*/

public class Socio {
	private String nombre;
	private int antiguedad;
	public Socio(String nom, int anti) {
		nombre=nom;
		antiguedad=anti;
	}
	
	public String retornarNom() {
		return nombre;
	}
	public int retornarAntig() {
		return antiguedad;
	}
	public void imprimir() {
		System.out.println("El Socio "+nombre+" tiene "+antiguedad+" año de antiguedad.");
	}
	



}
