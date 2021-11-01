package tarea6_Menu;

public class Calcular {
	//atributo
	private int resultado = 0;
	
	//metodos
	public int SumaDosNum(int a, int b) {
		return this.resultado = a+b;
	} 
	
	public int SumaTresNum(int a, int b, int c) {
		return this.resultado = a+b+c;
	}
	
	public int MultDosNum(int a,int b) {
		return this.resultado = a *b;
	}
	
	public int MultTresNum(int a,int b,int c) {
		return this.resultado = a *b*c;
	}
	
	public int RestarDosNumP(int a, int b) {
		if(a >= 0 && b >= 0) {
			this.resultado = a-b;
		}
		else {System.out.println("los numeros A: "+a+" y B: "+b+", no son positivos");}
		return this.resultado;
	}
	
	public int RestDosNumN(int a, int b){
		if(a < 0 && b < 0) {
			this.resultado = a-b;
		}
		else {System.out.println("los numeros A: "+a+" y B: "+b+", no son negativos");}
		return this.resultado;
	}
}