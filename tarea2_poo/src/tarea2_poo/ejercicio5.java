package tarea2_poo;

public class ejercicio5 {
	public static void main(String[] args) {
		Fraccion op1 = new Fraccion();
		//op1.suma(2,4,-8,3);
		//op1.resta(6, 7, 1, 5);
		//op1.multi(3, 3, 2, 2);
		op1.div(2, 4, 4, 10);
		System.out.println(op1);
	}
}

class Fraccion{
	private float resultadoN = 0f,resultadoD = 0f, almacen1 = 0f, almacen2 = 0f, almacen3 = 0f, almacen4 = 0f;
	
	void suma(float numerador1,float denominador1,float numerador2,float denominador2) {
		this.almacen1 = numerador1 * denominador2;
		this.almacen2 = numerador2 * denominador1;
		if(denominador1 == denominador2) {this.almacen3 = denominador1;}
		else {this.almacen3 = denominador1 * denominador2;}
		this.resultadoN = this.almacen1 + this.almacen2;
		this.resultadoD = this.almacen3;
	}
	
	void resta(float numerador1,float denominador1,float numerador2,float denominador2) {
		this.almacen1 = numerador1 * denominador2;
		this.almacen2 = numerador2 * denominador1;
		if(denominador1 == denominador2) {this.almacen3 = denominador1;}
		else {this.almacen3 = denominador1 * denominador2;}
		this.resultadoN = this.almacen1 - this.almacen2;
		this.resultadoD = this.almacen3;
	}
	
	void multi(float numerador1,float denominador1,float numerador2,float denominador2) {
		this.resultadoN = numerador1 * numerador2;
		this.resultadoD = denominador1 * denominador2;
	}
	
	void div(float numerador1,float denominador1,float numerador2,float denominador2) {
		this.resultadoN = numerador1 * denominador2;
		this.resultadoD = denominador1 * numerador2;
	}
	
	@Override
	public String toString() {
		return "el resultado de la operacion es: "+this.resultadoN+"/"+this.resultadoD;
	}
}