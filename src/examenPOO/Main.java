package examenPOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean bandera;
		boolean bandera3 = true;
		
		int decicion = 0;
		int cont = -1;
		int estrellas;
		int cantidad;
		int precio;
		int decicion2;
		int decicion3;
		
		
		String nombre;
		String id;
		String tipo;
		String direccion;
		
				
		Cocinerio cosineros = new Cocinerio();
		
		Receta recetas[] = new Receta[20];
		
		listaIngredientes listaIngredientesI = new listaIngredientes();
		
		Granos granos = new Granos();
		
		Scanner leer = new Scanner(System.in);
		
		Pastas pastas = new Pastas();
		
		while(bandera3 == true) {
			
			System.out.println("BIENVENIDO LA LA COSINA EL BUEN DESAYUNO"+"\n");
			System.out.println("\t"+"Eliga Una Opcion"+"\n");
			System.out.println("0. Agregar Cocinero");
			System.out.println("1. Agregar Reseta");
			System.out.println("2. Agregar Lista De Ingredientes Que Contenga La Cocina");
			System.out.println("3. Agregar Tipos De Pastas");
			System.out.println("4. Agregar Tipos De Granos");
			System.out.println("5. Salir");
			
			decicion = Integer.parseInt(leer.nextLine());
			
			
			
			switch(decicion) {
			
			case 0:{
				
				bandera = true;
				
				while (bandera == true) {
					
					System.out.println("Agrege Cosinero");
					System.out.println("Estrellas");
					estrellas = Integer.parseInt(leer.nextLine());
					System.out.println("Nombre");
					nombre = leer.nextLine();
					System.out.println("Dirreccion");
					direccion = leer.nextLine();
					System.out.println("ID");
					id = leer.nextLine();
					
					Cocinerio cosinero = new Cocinerio(estrellas,nombre,direccion,id);
					cosineros.agregarCosinero(cosinero);
					
					System.out.println("Quieres Agregar Otro Cocinero si = 1, no = 0");
					
					decicion2 = Integer.parseInt(leer.nextLine());
					
					if(decicion2 == 0) {
						
						bandera = false;
						
						cosineros.imprimirCocinero();
						
					}
					
				}
				
				break;
				
			}
			case 1:{
				
				bandera = true;
				boolean bandera2 = true;
				
				while(bandera == true) {
					bandera2 = true;
					cont++;
					int i=0;
					
					System.out.println("Agrege La Reseta");
					System.out.println("Nombre");
					nombre = leer.nextLine();
					System.out.println("Tipo");
					tipo = leer.nextLine();
					
					
					recetas[cont] = new Receta(nombre,tipo);
					
					while(bandera2 == true) {
						
						i++;
						
						System.out.println(i+". Agrege Los Ingredientes De La Reseta");
						System.out.println("Nombre");
						nombre = leer.nextLine();
						System.out.println("Cantidad");
						cantidad = Integer.parseInt(leer.nextLine());
						
						listaIngredientes listaIngredientes = new listaIngredientes(cantidad,nombre);
						recetas[cont].agregarRecetaI(listaIngredientes);
						
						System.out.println("Quieres Agregar Otro Ingrediente A La Reseta si = 1, no = 0");
						
						decicion3 = Integer.parseInt(leer.nextLine());
						
						if(decicion3 == 0) {
							
							bandera2 = false;
							
						}
						
					}
					
					
					System.out.println("Quieres Agregar Otro Reseta si = 1, no = 0");
					
					decicion2 = Integer.parseInt(leer.nextLine());
					
					if(decicion2 == 0) {
						
						bandera = false;
						
					}

				}
				
				for(int i=0; i<=cont;i++) {
					
					recetas[i].imprimirIngredientesR();
					
				}
							
				break;
				
			}
			
			case 2:{
				
				bandera = true;
				
				while (bandera == true) {
					
					System.out.println("Agrege Ingedientes A La Lista");
					System.out.println("Nombre");
					nombre = leer.nextLine();
					System.out.println("Cantidad");
					cantidad = Integer.parseInt(leer.nextLine());
					
					listaIngredientes listaIngredienteI = new listaIngredientes(cantidad,nombre);
					listaIngredientesI.agregarListaIngredientes(listaIngredienteI);
					
					System.out.println("Quieres Agregar Otro Ingrediente si = 1, no = 0");
					
					decicion2 = Integer.parseInt(leer.nextLine());
					
					if(decicion2 == 0) {
						
						bandera = false;
						listaIngredientesI.imprimirIngredientes();
						
					}
					
				}
				
				break;
				
			}
			
			case 3:{
				
				bandera = true;
				
				while (bandera == true) {
				
					System.out.println("Agrege Un Nuevo tipo De Pasta");
					System.out.println("Nombre");
					nombre = leer.nextLine();
					System.out.println("Precio");
					precio = Integer.parseInt(leer.nextLine());
					
					Pastas pasta = new Pastas(nombre,precio);
					pastas.agregarComida(pasta);
					
					System.out.println("Quieres Agregar Otro Tipo de Pasta si = 1, no = 0");
					
					decicion2 = Integer.parseInt(leer.nextLine());
					
					if(decicion2 == 0) {
						
						bandera = false;
						pastas.imprimirComida();
						
					}
					
				}
				
				break;
				
			}
			
			case 4:{
				
				bandera = true;
				
				while (bandera == true) {
				
				System.out.println("Agrege Un Nuevo tipo De Granos");
				System.out.println("Nombre");
				nombre = leer.nextLine();
				System.out.println("Precio");
				precio = Integer.parseInt(leer.nextLine());
				
				Granos grano = new Granos(nombre,precio);
				granos.agregarComida(grano);
				
				System.out.println("Quieres Agregar Otro Tipo de Pasta si = 1, no = 0");
				
				decicion2 = Integer.parseInt(leer.nextLine());
				
				if(decicion2 == 0) {
					
					bandera = false;
					granos.imprimirComida();
					
				}
				
			}
				
				break;
				
			}
			
			case 5:{
				
				bandera3 = false;
				break;
				
			}
			
			default:{
				
				System.out.println("Opcion No Encontrada"+"\n");
				
				break;
				
			}
			
			}
			
		}
		
	}
	
}
