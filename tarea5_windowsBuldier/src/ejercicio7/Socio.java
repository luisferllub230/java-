package ejercicio7;

public class Socio {
	static int ProximoNumero = 0; //numero total o id????
	private String nombre;
	private String numero;
	
	//-----> get
	public String getNombre() {
		return this.nombre;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	//-----> set
	public void setNombre(String nombre) {
		Socio.ProximoNumero += 1;
		this.nombre = nombre;
	}
	
	public void setNumero(String num) {
		this.numero = num;
	}
}
