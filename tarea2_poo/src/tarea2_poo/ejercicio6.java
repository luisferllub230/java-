package tarea2_poo;

public class ejercicio6 {
	public static void main(String[] args) {
		Complejo op1 = new Complejo();
		//op1.suma(2,4,8,3);
		//op1.resta(6, 7, 1, 5);
		op1.mult(7,1,-3,-5);//el imaginario siempre es negativo
		//op1.div(7, 1, -3, -5);
		System.out.println(op1);
	}
}

class Complejo{
	private int resultadoR = 0,resultadoI = 0;
	
	void suma(int real1,int ima1,int real2,int ima2) {
		this.resultadoR = real1 + real2;
		this.resultadoI = ima1 + ima2;
	}
	
	void resta(int real1,int ima1,int real2,int ima2) {
		this.resultadoR = real1 - real2;
		this.resultadoI = ima1 - ima2;
	}
	
	void mult(int real1,int ima1,int real2,int ima2) {
		int almacen1 = real1*real2;
		int almacen2 = real1*ima2;//i
		int almacen3 = ima1 * real2;//i
		int almacen4 = ima1 * ima2;//i^2
		//simplifico 
		int almacen5 = almacen2 + almacen3;
		int almacen6 = almacen4 * 1;
		this.resultadoR = almacen1 - almacen6;
		this.resultadoR *= -1;
		this.resultadoI = almacen5;
	}
	
	void div(int real1,int ima1,int real2,int ima2) {
		this.resultadoR =  (real1*real2 + real1*ima2)-(ima1*real2 -ima1*ima2*(-1)) / (real2^2 + ima2^2);
	}
	
	@Override
	public String toString() {
		return "el resultado de la operacion es: "+this.resultadoR+" "+this.resultadoI+"i";
	}
}