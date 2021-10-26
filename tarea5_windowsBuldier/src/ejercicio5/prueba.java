package ejercicio5;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		libro l1 = new libro();
		l1.setOriginal(true);
		l1.setTitulo("prueba titulo");
		l1.setPrestable(true);
		libro l2 = new libro();
		l2.setOriginal(true);
		l2.setTitulo("prueba titulo numero 2");
		l2.setPrestable(false);
		
		System.out.println("--->prueba1\n\noriginal: "+l1.getOriginal()+"\ntitulo: "+l1.getTitulo()+"\nprestable: "+l1.getPrestable());
		System.out.println("\n--->prueba2\n\noriginal: "+l2.getOriginal()+"\ntitulo: "+l2.getTitulo()+"\nprestable: "+l2.getPrestable());
	}

}
