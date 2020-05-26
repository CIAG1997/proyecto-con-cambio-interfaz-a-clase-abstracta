package examenPOO;

public class Cocinerio extends Persona {
	
	private int estrellas;
	private int cont;
	private Cocinerio cocinerios[] = new Cocinerio[20];

	public Cocinerio(int pEstrella, String pNombre, String pDirreccion, String pId) {
		
		this.estrellas = pEstrella;
		setNombreCompleto(pNombre);
		setDireccion(pDirreccion);
		setDireccion(pDirreccion);
		setId(pId);
		
	}
	
     public Cocinerio() {
		
		cont = -1;
		cocinerios = new Cocinerio[20];
		
	}
	
	public int getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}
	
	public void agregarCosinero(Cocinerio cocinero) {
		
		cont++;
		cocinerios[cont] = new Cocinerio(cocinero.getEstrellas(),cocinero.getNombreCompleto(),cocinero.getDireccion(),cocinero.getId());
		
	}
	
	public void imprimirCocinero() {
	
		System.out.println("Estrellas:"+"\t\t"+"Nombre:"+"\t\t"+"Dirrecion:"+"\t\t"+"ID:");
		for(int i= 0; i <= cont; i++){ 
						
			System.out.println(cocinerios[i].getEstrellas()+"\t\t"+cocinerios[i].getNombreCompleto()+"\t\t"+cocinerios[i].getDireccion()+"\t\t"+cocinerios[i].getId());
			
		}
		
		System.out.println("\n");
		
	}

}
