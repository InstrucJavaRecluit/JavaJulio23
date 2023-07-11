package common;

import java.util.HashMap;
import java.util.Scanner;

public class Menu2 {
	public static void main (String[]args) {
		
		HashMap<String, Contacto> agenda = new HashMap<String, Contacto>();
		
		Scanner scan = new Scanner (System.in);
		String nombre="";
		String numTelefono="";
		String direccion="";
		Contacto c = null;
		int opcion=0;
		
		do {
			System.out.println("Menu");
			System.out.println("1. Registrar contacto");
			System.out.println("2. Buscar contacto");
			System.out.println("3. Editar datos del contacto");
			System.out.println("4. Eliminar contacto");
			System.out.println("5. Mostrar todos los contactos");
			System.out.println("6. Salir");
			System.out.print("ingrese opcion ");
			opcion = scan.nextInt();
			
			
			switch (opcion) {
			
			case 1: 
				System.out.println("OPCION 1 registrar contacto");
				scan.nextLine();
				System.out.println("Nombre:");
				nombre = scan.nextLine();
				
				System.out.println("Telefono:");
				numTelefono = scan.nextLine();
				
				System.out.println("Direccion:");
				direccion = scan.nextLine();
				
				System.out.println(nombre);
				
				c= new Contacto(nombre, numTelefono,direccion);
				agenda.put(nombre, c);
				
				System.out.println(agenda.size());
				break;
				
			case 2: 
				System.out.println("OPCION 2 buscar contacto");
				System.out.println("Ingresa el nombre buscado");
				nombre=scan.nextLine();
				//busca en la lista el conacto deseado
				for (int i = 0; i < agenda.size(); i++) {//ajustar a la longitud del hasmap
					if(agenda.containsKey(nombre)) {
						c = agenda.get(i);
						break;
					}
				}
				if (c!=null) {
					System.out.println("Contacto: "+c);
				}	else {
					System.out.println("El contacto no existe");
				}
				break;
			case 3: 
				System.out.println("OPCION 3 editar contacto");
				System.out.println("Ingresa el nombre del contacto a Editar:");
				nombre=scan.nextLine();
				//busca el contacto
				for (int i = 0;  i < agenda.size(); i++) {
					if (agenda.get(i).getNombre().equals(nombre)) {
						System.out.println("Ingresa el nuevo del telefono a Editar:");
						numTelefono=scan.nextLine();
						System.out.println("Ingresa la nueva  direccion a Editar:");
						direccion=scan.nextLine();
						
						agenda.get(i).setDireccion(direccion);
						agenda.get(i).setNumTelefono(numTelefono);
						break;
					}
				}
				break;
			case 4: 
				System.out.println("OPCION 4 eliminar contacto");
				System.out.println("Ingresa el nombre del contacto a eliminar");
				nombre=scan.nextLine();
				
				for (int i = 0; i < agenda.size(); i++) {
					if (agenda.get(i).getNombre().equals(nombre)) {
						//elimiar el contacto
						agenda.remove(c);
						break;
					}
				}
				break;
			case 5: 
				System.out.println("OPCION 5 mostrar contactos");
//				for(String key: agenda.keySet()){
//					System.out.println(key);
//					  System.out.println(agenda.get(key));
//					}
				
				System.out.println(agenda.toString());
				break;
			
			} 
		}while(opcion >=1 && opcion<=6);
		

	}

}