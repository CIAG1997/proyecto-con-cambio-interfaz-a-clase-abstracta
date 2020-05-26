package examenPOO;

public class listaIngredientes {
	
	private int cantidad;	
    private Partes partes[];
	private String nombre;
	private int cont;
	private listaIngredientes listaIngredientes[]; 
	
    public listaIngredientes(int pCantidad, String pNombre) {
    	
    	cantidad = pCantidad;
    	nombre = pNombre;
    	
    }
    
    public listaIngredientes() {
    	
    	cont = -1;
    	listaIngredientes = new listaIngredientes[20];
    	
    }
    
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public Partes[] getPartes() {
		return partes;
	}

	public void setPartes(Partes[] partes) {
		this.partes = partes;
	}

	
	public void agregarListaIngredientes(listaIngredientes listaIngredientes) {
		
		cont++;
		this.listaIngredientes[cont] = new listaIngredientes(listaIngredientes.getCantidad(),listaIngredientes.getNombre());

	}
	
	public void imprimirIngredientes() {
		
		System.out.println("\t"+"Lista Ingredientes Independiente:"+"\n");
		System.out.println("Nombre: "+"\t\t\t"+"Cantidad:");
		
		for(int i= 0; i <= cont; i++){ 
						
			System.out.println(listaIngredientes[i].getNombre()+"\t\t\t"+listaIngredientes[i].getCantidad());
			
		}
		
		System.out.println("\n");
		
	}
}
