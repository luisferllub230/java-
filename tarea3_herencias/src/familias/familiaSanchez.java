package familias;
import phmta.*;

public class familiaSanchez extends familia{
	public static void main(String[] args){
		familia fami = new familia();
		fami.tipoFamilia("Sanchez");
		fami.abuelo("kelke Sanchez",99);
		fami.abuela("keiti nup", 55);
		fami.padre1("car Sanchez", 25);
		fami.madre1("marmi mar", 20);
		fami.tios1("pepe Sanchez", 28);
		fami.tios2("carlos Sanchez", 25);
		fami.hijos1("juan Sanchez", 5);
		fami.hijos2("eduardo Sanchez", 11);
		
		System.out.println(fami.toString());
	}
}
