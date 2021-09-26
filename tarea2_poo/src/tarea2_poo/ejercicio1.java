package tarea2_poo;

public class ejercicio1 {

	public static void main(String[] args) {
		persona Persona1 = new persona("luis","fernandez",21,true,"12345678","policia");
		Persona1.p1accion("un patruyaje");
		Persona1.p1accion2("limpiando el arma");
		Persona1.p1accion3("dando su informacion");
		persona Persona2 = new persona("maria","lupita",32,false,"4234234423","doctora");
		Persona2.p2accion("curando a una persona");
		Persona2.p2accion2("en la cunsulta");
		Persona2.p2accion3("terminando");
		persona Persona3 = new persona("Linda","del leon",32,false,"421223233","contadora");
		Persona3.p3accion("sacando cuentas");
		Persona3.p3accion2("explicando");
		Persona3.p3accion3("hablando con el jefe");
		persona Persona4 = new persona("carlos","miguel",34,true,"23423435345","gerente");
		Persona4.p4accion("la nomina");
		Persona4.p4accion2("en la oficina");
		Persona4.p4accion3("hablando con el jefe");
		persona Persona5 = new persona("tomas","lauto",21,false,"2322323435345","panadero");
		Persona5.p5accion("la masa");
		Persona5.p5accion2("en la cocina");
		Persona5.p5accion3("hablando con el cliente");
		persona Persona6 = new persona("carlos","miguel",34,true,"23423435345","gerente");
		Persona6.p6accion("la nomina");
		Persona6.p6accion2("en la oficina");
		Persona6.p6accion3("hablando con el jefe");
		persona Persona7 = new persona("leandro","miguel",24,true,"2123232443","cajero");
		Persona7.p7accion("una facutra");
		Persona7.p7accion2("en el mostrador");
		Persona7.p7accion3("hablando con el duenio");
	}

}

class persona{
	private String nombre;
	private String apellido;
	private int edad;
	private boolean casado;
	private String NCI;
	private String trabajo;  
	
	//constructor
	public persona(String nombre,String apellido,int edad,boolean casado,String numeroDocuIdentidad,String profecion){
		System.out.println("=====================================================================================");
		System.out.println("se registro la persona: nom:"+nombre+", apell:"+apellido+", edad:"+edad+", DOC:"+numeroDocuIdentidad+
				", trab:"+profecion+"\n\n");
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.casado = casado;
		this.NCI = numeroDocuIdentidad;
		this.trabajo = profecion;
	}
	
	/*metodos...  mucho code :,( en un archivo pero era lo que se pedia en el mandato*/
	//persona1 
	void p1accion(String accion) {
		System.out.println(this.nombre+" "+this.apellido+" ced:"+this.NCI+" es un "+this.trabajo+" y esta haciendo "+accion);
	}
	void p1accion2(String accion){
		System.out.println(this.nombre+" de "+this.edad+" es un "+this.trabajo+" y esta "+accion);
	}
	void p1accion3(String accion) {
		System.out.println(this.nombre+" de "+this.edad+" ced:"+this.NCI+" es un "+this.trabajo+" y esta "+accion);
	}
	
	//persona2
	void p2accion(String accion) {
		System.out.println(this.nombre+" "+this.apellido+" ced:"+this.NCI+" es un "+this.trabajo+" y esta haciendo "+accion);
	}
	void p2accion2(String accion){
		System.out.println(this.nombre+" de "+this.edad+" es un "+this.trabajo+" y esta "+accion);
	}
	void p2accion3(String accion) {
		System.out.println(this.nombre+" de "+this.edad+" ced:"+this.NCI+" es un "+this.trabajo+" y esta "+accion);
	}
	
	//persona3
	void p3accion(String accion) {
		System.out.println(this.nombre+" "+this.apellido+" ced:"+this.NCI+" es un "+this.trabajo+" y esta haciendo "+accion);
	}
	void p3accion2(String accion){
		System.out.println(this.nombre+" de "+this.edad+" es un "+this.trabajo+" y esta "+accion);
	}
	void p3accion3(String accion) {
		System.out.println(this.nombre+" de "+this.edad+" ced:"+this.NCI+" es un "+this.trabajo+" y esta "+accion);
	}
	
	//persona4
	void p4accion(String accion) {
		System.out.println(this.nombre+" "+this.apellido+" ced:"+this.NCI+" es un "+this.trabajo+" y esta haciendo "+accion);
	}
	void p4accion2(String accion){
		System.out.println(this.nombre+" de "+this.edad+" es un "+this.trabajo+" y esta "+accion);
	}
	void p4accion3(String accion) {
		System.out.println(this.nombre+" de "+this.edad+" ced:"+this.NCI+" es un "+this.trabajo+" y esta "+accion);
	}
	
	//persona5
	void p5accion(String accion) {
		System.out.println(this.nombre+" "+this.apellido+" ced:"+this.NCI+" es un "+this.trabajo+" y esta haciendo "+accion);
	}
	void p5accion2(String accion){
		System.out.println(this.nombre+" de "+this.edad+" es un "+this.trabajo+" y esta "+accion);
	}
	void p5accion3(String accion) {
		System.out.println(this.nombre+" de "+this.edad+" ced:"+this.NCI+" es un "+this.trabajo+" y esta "+accion);
	}
	
	//persona6
	void p6accion(String accion) {
		System.out.println(this.nombre+" "+this.apellido+" ced:"+this.NCI+" es un "+this.trabajo+" y esta haciendo "+accion);
	}
	void p6accion2(String accion){
		System.out.println(this.nombre+" de "+this.edad+" es un "+this.trabajo+" y esta "+accion);
	}
	void p6accion3(String accion) {
		System.out.println(this.nombre+" de "+this.edad+" ced:"+this.NCI+" es un "+this.trabajo+" y esta "+accion);
	}
	
	//persona7
	void p7accion(String accion) {
		System.out.println(this.nombre+" "+this.apellido+" ced:"+this.NCI+" es un "+this.trabajo+" y esta haciendo "+accion);
	}
	void p7accion2(String accion){
		System.out.println(this.nombre+" de "+this.edad+" es un "+this.trabajo+" y esta "+accion);
	}
	void p7accion3(String accion) {
		System.out.println(this.nombre+" de "+this.edad+" ced:"+this.NCI+" es un "+this.trabajo+" y esta "+accion);
	}
}















