
public class Club {
	private Socio socio1,socio2,socio3;
	
	public Club() {
		socio1=new Socio("Juan",3);
		socio2=new Socio("Ana",8);
		socio3=new Socio("Jose",5);
	}
	public void imprimirClub() {
		socio1.imprimir();
		socio2.imprimir();
		socio3.imprimir();
	}
	public void mayorAntigu() {
		if(socio1.retornarAntig()>socio2.retornarAntig()&&socio1.retornarAntig()>socio2.retornarAntig()) {
			System.out.println("El Socio con mayar antiguedad es "+socio1.retornarNom());
		}else if(socio2.retornarAntig()>socio3.retornarAntig()) {
			System.out.println("El Socio con mayar antiguedad es "+socio2.retornarNom());
		}else {
			System.out.println("El Socio con mayar antiguedad es "+socio3.retornarNom());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Club person1=new Club();
		person1.imprimirClub();
		person1.mayorAntigu();
	}
}
