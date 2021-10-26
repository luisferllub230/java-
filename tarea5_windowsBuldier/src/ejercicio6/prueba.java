package ejercicio6;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TiposTriangulos t1 = new TiposTriangulos();
		t1.determinarTriangulo(20, 40, 100);
		System.out.println(t1.aunguloRecto+", "+t1.equilatero+", "+t1.escaleno+", "+t1.isosceles);
	}

}
