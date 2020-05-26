package examenPOO;

public class Pastas extends Partes {
	
	private Pastas pastas[];
	private int cont;
	
	public Pastas(String pNombre, int pPrecio) {
		
		setNombre(pNombre);
		setPrecio(pPrecio);
		
	}
	
	public Pastas() {
		
		cont=-1;
		pastas = new Pastas[20];
		
	}
	
	public void agregarComida(Pastas pastas) {
		
		cont++;
		this.pastas[cont] = new Pastas(pastas.getNombre(),pastas.getPrecio());
		
	}

	
	public void imprimirComida() {
	
		System.out.println("\t"+"Lista De las Pastas"+"\n");
		System.out.println("Nombre: "+"\t\t\t"+"Precios:");
		
		for(int i= 0; i <= cont; i++){ 
						
			System.out.println(pastas[i].getNombre()+"\t\t\t"+pastas[i].getPrecio());
			
		}
		
		System.out.println("\n");
		
	}

}
