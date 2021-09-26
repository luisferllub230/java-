package tarea2_poo;

public class ejercicio4 {
	
	public static void main(String[] args) {
		Libro usuari1 = new Libro("people");
		usuari1.setDevolucion(1);
		System.out.println(usuari1);
		Libro usuari2 = new Libro("word");
		usuari2.setPrestamo(5);
		System.out.println(usuari1);
	}
}

class Libro{
	private int libro = 0;
	private String nombreL;
	private String accion;
	
	//constructores
	Libro(){
		
	}
	Libro(String nombreLibro){
		this.nombreL = nombreLibro;
	}
	
	/*getters and setters*/
	public void setPrestamo(int cantidadL) {
		this.libro = cantidadL;
		this.accion = "prestamo";
	}
	public int getPrestamo() {
		return this.libro;
	}
	
	public void setDevolucion(int cantidadL) {
		this.libro = cantidadL;
		this.accion = "Devolucion";
	}
	public int getDevolucion() {
		return this.libro;
	}
	
	/*toString*/
	@Override
	public String toString() {
		return "se realizo un/a: "+this.accion+"\ncantidad: "+this.libro+"\nNOMBRE DEL LIBRO: "+this.nombreL;
	}

}
