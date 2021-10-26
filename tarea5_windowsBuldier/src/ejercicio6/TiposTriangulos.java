package ejercicio6;

public class TiposTriangulos {
	
	String equilatero= "";
	String isosceles= "";
	String escaleno= "";
	String aunguloRecto= "";
	
	//determinaTriangulo
	public void determinarTriangulo(int a, int b, int c) {
		if(a == b && a == c && b == c) {
			this.equilatero = "es un tringulo equilatero";
		}
		if(a == b || a == c || c==b) {
			this.isosceles = "es un trinangulo isosceles";
		}
		if(a == 90 || b == 90 || c == 90 ) {
			this.aunguloRecto = "Tiene un angulo recto";
		}
		else {
			this.escaleno = "es un triangulo escaleno";
		}
	}
}
