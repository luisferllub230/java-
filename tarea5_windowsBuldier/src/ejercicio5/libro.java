package ejercicio5;

public class libro {
	
	private boolean prestable = false;
	private boolean original = false;
	private String titulo;

	//------> get
	public boolean getPrestable(){
		return this.prestable;
	}
	
	public boolean getOriginal() {
		return this.original;
	}

	public String getTitulo() {
		return this.titulo;
	}
	
	
	//------> set
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setOriginal(boolean original) {
		this.original = original;
	}
	
	public void setPrestable(boolean prestable) {
		this.prestable = prestable;
	}

}
