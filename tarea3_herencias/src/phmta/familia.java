package phmta;

public class familia implements hijos, padre, madre, tios, abuelos{
	
	//family
	private String tipoFamilia = "";
	//data grandparents
	private String nombreAbuelo = "";
	private String nombreAbuela = "";
	private int edadAbuelo = 0;
	private int edadAbuela = 0;
	//data father
	private String nombrePadre = "";
	private int edadPadre = 0;
	//data mother
	private String nombreMadre = "";
	private int edadMadre = 0;
	//data uncles
	private String nombreTio1 = "";
	private String nombreTio2 = "";
	private int edadTio1 = 0;
	private int edadTio2 = 0;
	//data boys
	private String nombreHijo1 = "";
	private int edadHijo1 = 0;
	private String nombreHijo2 = "";
	private int edadHijo2 = 0;
	
	public void tipoFamilia(String familia) {
		this.tipoFamilia = familia;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "En la familia "+this.tipoFamilia+" tenemos \n\nal abuelo "+this.nombreAbuelo+" con una edad de "+this.edadAbuelo+
				"\ntambien esta la abuela "+this.nombreAbuela+" con una edad de "+this.edadAbuela+
				"\ntambie esta el padre "+this.nombrePadre+" y su edad "+this.edadPadre+
				"\ntambie esta la madre "+this.nombreMadre+" y su edad "+this.edadMadre+
				"\ntambie esta el tio "+this.nombreTio1+" y su edad "+this.edadTio1+
				"\ntambie esta el tio "+this.nombreTio2+" y su edad "+this.edadTio2+
				"\ntambie esta el hijo "+this.nombreHijo1+" y su edad "+this.edadHijo1+
				"\ntambie esta el hijo "+this.nombreHijo2+" y su edad "+this.edadHijo2;
	}
	
	@Override
	public void abuelo(String nombre, int edad) {
		// TODO Auto-generated method stub
		this.nombreAbuelo = nombre;
		this.edadAbuelo = edad;
	}

	@Override
	public void abuela(String nombre, int edad) {
		// TODO Auto-generated method stub
		this.nombreAbuela = nombre;
		this.edadAbuela = edad;
	}

	@Override
	public void tios1(String nombre, int edad) {
		// TODO Auto-generated method stub
		this.nombreTio1 = nombre;
		this.edadTio1 = edad;
	}

	@Override
	public void tios2(String nombre, int edad) {
		// TODO Auto-generated method stub
		this.nombreTio2 = nombre;
		this.edadTio2 = edad;
	}

	@Override
	public void madre1(String nombre, int edad) {
		// TODO Auto-generated method stub
		this.nombreMadre = nombre;
		this.edadMadre = edad;
	}

	@Override
	public void padre1(String nombre, int edad) {
		// TODO Auto-generated method stub
		this.edadPadre = edad;
		this.nombrePadre = nombre;
	}

	@Override
	public void hijos1(String nombre, int edad) {
		// TODO Auto-generated method stub
		this.nombreHijo1 = nombre;
		this.edadHijo1 = 5;
	}

	@Override
	public void hijos2(String nombre, int edad) {
		// TODO Auto-generated method stub
		this.nombreHijo2 = nombre;
		this.edadHijo2 = edad;
	}
}