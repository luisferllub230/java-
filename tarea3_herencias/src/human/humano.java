package human;

public class humano {
	
	public void man() {
		System.out.println("soy un hombre");
	}
	
	public void woman() {
		System.out.println("soy una mujer");
	}
}

//------------------masculino
class  hombre extends humano{
	public void man() {
		super.man();
	}
	
	public void boy() {
		System.out.println("soy un hombre pero sigo siendo un ninio");
	}
	
	public void young() {
		System.out.println("soy un hombre pero sigo siendo un joven");
	}
	
	public void old() {
		System.out.println("soy un hombre y ya soy adulto");
	}
}

class ninio extends hombre{
	public void boy() {
		super.boy();
	}
}

class adolecente extends hombre{
	public void young() {
		super.young();
	}
}

class adultoH extends hombre{
	public void old() {
		super.old();
	}
}

//------------------femenino
class mujer extends humano{
	public void woman() {
		super.woman();
	}
	
	public void girl() {
		System.out.println("soy una mujer pero sigo siendo una ninia");
	}
	
	public void youngGirl() {
		System.out.println("soy una pero sigo siendo una joven");
	}
	
	public void oldWoman() {
		System.out.println("soy una mujer y ya soy adulta");
	}
}

class ninia extends mujer{
	public void girl() {
		super.girl();
	}
}

class adolescenteM extends mujer{
	public void younGirl() {
		super.youngGirl();
	}
}

class adulta extends mujer{
	public void oldWoman() {
		super.oldWoman();
	}
}

