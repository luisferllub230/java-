package familias;
import phmta.*;

public class familiaMartinez extends familia{
	
	public static void main(String[] args) {
		familia fam = new familia();
		fam.tipoFamilia("Martinez");
		fam.abuelo("luis martinez",89);
		fam.abuela("carla manca", 85);
		fam.padre1("carlos martinez", 45);
		fam.madre1("marta martinez cast", 20);
		fam.tios1("pepe martinez", 28);
		fam.tios2("carlitos martinez", 25);
		fam.hijos1("pepito martinez", 5);
		fam.hijos2("marta", 1);
		
		System.out.println(fam.toString());
	}
	
}
