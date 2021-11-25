package Clases;

public abstract class Personas{
	
	private int edadint;
	private String tipoPersonaJ = "joven";
	private String tipoPersonaN = "nino";
	private String tipoPersonaA = "adulto";
	private String tipoPersonaRetorno = "";

	//metodo tipo de persona
	public String tipoPersonas( String edad) {
		
		this.edadint = Integer.parseInt(edad); 
		
		if(this.edadint < 15) {
			this.tipoPersonaRetorno = this.tipoPersonaN;
		}
		else if(this.edadint > 15 && this.edadint < 25) {
			this.tipoPersonaRetorno = this.tipoPersonaJ;
		}
		else if(this.edadint >25) {
			this.tipoPersonaRetorno = this.tipoPersonaA;
		}
		
		return tipoPersonaRetorno;
	}
	
	
	//metodo abstrato 
	public abstract void accionproseso(String informar);
	
}
