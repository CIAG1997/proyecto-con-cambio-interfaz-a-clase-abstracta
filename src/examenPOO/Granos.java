package examenPOO;

public class Granos extends Pastas{
	
	private int cont;
	private Granos granos[];
	
	public Granos(String pNombre, int pPrecio) {
		
		setNombre(pNombre);
		setPrecio(pPrecio);
		
	}
	
	public Granos() {
		
		cont=-1;
		granos = new Granos[20];
		
	}
	
	public void agregarComida(Granos granos) {
		
		cont++;
		this.granos[cont] = new Granos(granos.getNombre(),granos.getPrecio());
		
	}
	
	public void imprimirComida() {
		
		System.out.println("\t"+"Lista De los Granos"+"\n");
		System.out.println("Nombre: "+"\t\t\t"+"Precios:");
		
		
		for(int i= 0; i <= cont; i++){ 
						
			System.out.println(granos[i].getNombre()+"\t\t\t"+granos[i].getPrecio());
			
		}		
		
		System.out.println("\n");
		
	}

}
