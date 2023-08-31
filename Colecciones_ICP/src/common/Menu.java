package common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		/*
		 * 1. Registrar un contacto
		 * 2. Buscar un contacto, por nombre
		 * 3. Editar los datos del contacto (telefono y dinecion)
		 * 4. Elimiinar un contacto
		 * 5. Mostrar todos los contactos
		 * 6. Salir
		 * Los datos se recibir desde teclado
		 */
		Contacto c = new Contacto();
		Scanner s = new Scanner(System.in);
		List<Contacto> listaContactos = new ArrayList<Contacto>();
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
					System.out.println();
					c = new Contacto(nombre, telefono, direccion);
					listaContactos.add(c);
					System.out.println("*****Contacto Registrado*****\n");
				break;
				
			case 2: System.out.println("\n*****BUSQUEDA DE CONTACTO*****");
					System.out.print("Ingresa el nombre de contacto a buscar: ");
					nombre = s.next();
					if (nombre.isEmpty()) {
						System.out.println("No se encuentra o no existe ese contacto\n");
					} else {
						System.out.println("\nCONTACTO ENCONTRADO");
						for (int i = 0; i < listaContactos.size(); i++) {
							if(listaContactos.get(i).getNombre().equals(nombre)) {
//								System.out.println(c.getNombre()+" - "+c.getNumTelefono()+" - "+c.getDireccion());
								c = listaContactos.get(i);
								break;
							}						
						}						
						if (c != null) {
							System.out.println("Contacto: "+c/*.getNombre()+" - "+c.getNumTelefono()+" - "+c.getDireccion()*/);
						}else {
							System.out.println("No se encuentra o no existe ese registro\n");
						}
						System.out.println();
					}
				break;
				
			case 3: System.out.println("\n*****EDITAR CONTACTO*****");
					System.out.print ("Ingresa el nombre del contacto: ");
					nombre = s.next();
					for (int i = 0; i < listaContactos.size(); i++) {
						if (listaContactos.get(i).getNombre().equals(nombre)) {
							System.out.println("\nCONTACTO ENCONTRADO");
							System.out.print("Ingresa su nuevo telefono: ");
							telefono = s.next();
							System.out.print("Ingresa su nueva direccion: ");
							direccion = s.next();
							
							listaContactos.get(i).setNumTelefono(telefono);
							listaContactos.get(i).setDireccion(direccion);
							
							System.out.println("*****Contacto Actualizado*****\n");
						}else {
							System.out.println("No existe ese contacto\n");
						}
					}
				break;
				
			case 4: System.out.println("\n****ELIMINAR CONTACTO*****");
					System.out.print("Ingresa el nombre del contacto: ");
					nombre = s.next();
					if (nombre.isEmpty()) {
						System.out.println("No existe ese contacto\n");
					} else {
						for (int i = 0; i < listaContactos.size(); i++) {
							if (listaContactos.get(i).getNombre().equals(nombre)) {
								listaContactos.remove(i);
								break;
							}
						}						
						System.out.println("*****CONTACTO ELIMINADO*****\n");
					}
				break;
				
			case 5: System.out.println("\n*****LISTA DE CONTACTOS*****");
					if (listaContactos.isEmpty()) {
						System.out.println("No existe ningun contacto");
					} else {
						for(Contacto contacto : listaContactos) {
							System.out.println(contacto.getNombre()+", "+contacto.getNumTelefono()+", "+contacto.getDireccion());
						}
//						for (int i = 0; i < listaContactos.size(); i++) {
//							System.out.println(i+" "+c.getNombre()+", "+c.getNumTelefono()+", "+c.getDireccion());
//						}
					}					
					System.out.println();
				break;
			
			case 6: System.out.println("SALIENDO..."); 
				break;
				
			default: System.out.println("OPCION INVALIDA");
				break;
			}
			
		} while (opcion >= 1 && opcion <6);
		s.close();
	}
	

}
