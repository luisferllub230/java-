package tarea2_poo;

public class ejercicio2 {
	public static void main(String[] args) {
		Cuenta usuario1 = new Cuenta("luis fernandez","292929","al9jandr0");
		//------------------------
		usuario1.setIngreso(400);
		System.out.println("el ultimo ingreso fue de un total de: "+usuario1.getIngreso());
		//------------------------
		usuario1.setTransferencia(100);
		System.out.println("se transfirio un total de: "+usuario1.getTransferencia());
		//------------------------
		usuario1.setReintegro(800);
		System.out.println("se reintegro un total de: "+usuario1.getReintegro());
		
		Cuenta usuario2 = new Cuenta();
		//------------------------
		usuario2.setIngreso(2004);
		System.out.println("el ultimo ingreso fue de un total de: "+usuario2.getIngreso());
		//------------------------
		usuario2.setTransferencia(112100);
		System.out.println("se transfirio un total de: "+usuario2.getTransferencia());
		//------------------------
		usuario2.setReintegro(500);
		System.out.println("se reintegro un total de: "+usuario2.getReintegro());
	}
}

class Cuenta{
	private int ingreso, reintegro, transferencia;
	
	//constructores
	public Cuenta() {
		System.out.println("=====================================================================================\n");
	}
	public Cuenta(String Unombre,String Upassword,String Ucuenta) {
		System.out.println("=====================================================================================");
		System.out.println("USUARIO: "+Unombre+", PASSWORD: "+Upassword+", CUENTA: "+Ucuenta+"\n");
	}
	
	//setters
	public void setIngreso(int ingreso) {
		this.ingreso = ingreso;
	}
	public void setReintegro(int reintegro) {
		this.reintegro = reintegro;
	}
	public void setTransferencia(int transferencia) {
		this.transferencia = transferencia;
	}
	
	//getters
	public int getIngreso() {
		return this.ingreso;
	}
	public int getReintegro() {
		return this.reintegro;
	}
	public int getTransferencia() {
		return this.transferencia;
	}
}