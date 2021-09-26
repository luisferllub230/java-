package tarea2_poo;

public class ejercicio3 {
	public static void main(String[] args) {
		
		Contador conta1 = new Contador("luis");
		conta1.setincrementar(12);
		System.out.println("incremento: "+conta1.getincrementar());
		conta1.setdecrementa(5);
		System.out.println("decremento: "+conta1.getincrementar());;
	}
}

class Contador{
	//constructores
	private int Contador = 0;
	
	public Contador() {
		
	}
	public Contador(String x) {
		System.out.println("usuario: "+x);;
	}
	
	/*getters and setters ++*/
	//setter
	public void setincrementar(int incrementarC) {
		this.Contador += incrementarC;
	}
	
	//getter
	public int getincrementar() {
		return this.Contador;
	}
	
	/*getters and setters --*/
	//setter
	public void setdecrementa(int decrementaC) {
		this.Contador -= decrementaC;
	}
	
	//getter
	public int getdecrementa() {
		return this.Contador;
	}
}