package common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MenuHASHMAP {

	public static void main(String[] args) {
		
		//List<Contacto> listaContactos = new ArrayList<>();
		Map<String, Contacto> mapa = new HashMap<String, Contacto>();
		Scanner s = new Scanner(System.in);
		Contacto c = new Contacto();
		String nombre;
		String telefono;
		String direccion;
		int opcion = 0;
		
		do {
			System.out.println("*====================== MENU ==========================*");
			System.out.println("1. REGISTRAR UN CONTACTO");
			System.out.println("2. BUSCAR UN CONTACTO, POR NOMBRE");
			System.out.println("3. EDITAR LOS DATOS DEL CONTACTO (TELEFONO Y DIRECCION)");
			System.out.println("4. ELIMINAR UN CONTACTO");
			System.out.println("5. MOSTRAR TODOS LOS CONTACTOS");
			System.out.println("6. SALIR");
			System.out.print("Opcion: ");
			opcion = s.nextInt();
			
			switch (opcion) {
			case 1: System.out.println("\n*****REGISTRO DE CONTACTO*****");
					System.out.print("Ingresa el nombre del contacto: ");
					nombre = s.next();
					System.out.print("Ingresa el numero de telefono: ");
					telefono = s.next();
					System.out.print("Ingresa su direccion: ");
					direccion = s.next();
					
					c = new Contacto(nombre, telefono, direccion);
					mapa.put(nombre, c); //Nombre es la clave y c es el valor del objeto
					System.out.println("*****CONTACTO REGISTRADO*****\n");
				break;
				
			case 2: System.out.println("\n*****BUSQUEDA DE CONTACTO*****");
					System.out.print("Ingresa el nombre de contacto a buscar: ");
					nombre = s.next();
					for (int i = 0; i < mapa.size(); i++) {
						if(mapa.containsKey(nombre)) {
							c = mapa.get(i);
							break;
						}						
					}
					if (c != null) {
						System.out.println("Contacto: "+c);
						System.out.println();
					} else {
						System.out.println("No se encuentra o no existe ese contacto\n");
					}					

				break;
				
			case 3:	System.out.println("\n*****EDITAR CONTACTO*****");
					System.out.print("Ingresa el nombre del contacto: ");
					nombre = s.next();
					
					if (mapa.containsKey(nombre)) {
						System.out.println("CONTACTO ENCONTRADO");
						System.out.print("Ingresa el nuevo telefono: ");
						telefono = s.next();
						System.out.print("Ingresa la nueva direccion: ");
						direccion = s.next();
						
						//c = new Contacto(nombre, telefono, direccion);
						//mapa.get(direccion)
						System.out.println("*****Contacto Actualizado*****");
					} else {
						System.out.println("No existe este contacto\n");
					}
//					for (int i = 0; i < mapa.size(); i++) {
//						if (mapa.get(i).getNombre().equals(nombre)) {
//							System.out.println("\nCONTACTO ENCONTRADO");
//							System.out.print("Ingresa su nuevo telefono: ");
//							telefono = s.next();
//							System.out.print("Ingresa su nueva direccion: ");
//							direccion = s.next();
//							
//							mapa.get(i).setNumTelefono(telefono);
//							mapa.get(i).setDireccion(direccion);
//							
//							System.out.println("*****Contacto Actualizado*****");
//						} else {
//							System.out.println("No existe ese contacto\n");
//						}
//					}
				break;
				
			case 4: System.out.println("\n****ELIMINAR CONTACTO*****");
					System.out.print("Ingresa el nombre del contacto: ");
					nombre = s.next();
					if (nombre.isEmpty()) {
						System.out.println("No existe este contacto\n");
					} else {
//						for (String key : mapa.keySet()) {
							if (mapa.containsKey(nombre)) {
								mapa.remove(nombre);
							}
//						}
						System.out.println("*****Contacto Eliminado*****\n");
//						for (int i = 0; i < mapa.size(); i++) {
//							if (mapa.get(i).getNombre().equals(nombre)) {
//								mapa.remove(i);
//								break;
//							}
//						}
					}
				break;
				
			case 5: System.out.println("\n*****LISTA DE CONTACTOS*****");
					if (mapa.isEmpty()) {
						System.out.println("No existe ningun contacto");
					} else {
						for (String key : mapa.keySet()) {
							System.out.println(mapa.get(key));
						}
					}
					System.out.println();
				break;
				
			case 6: System.out.println("SALIENDO...");
				break;
				
			default: System.out.println("OPCION INCORRECTA");
				break;
			}
			
		} while (opcion >= 1 && opcion <6);
		s.close();
		
	}

}
