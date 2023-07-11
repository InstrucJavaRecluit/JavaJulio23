package common;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class Menu {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
//		registrar un contacto
//		buscar un contacto
//		editar el contacto telefono y direccion
//		eliminar un contacto
//		mostar todos los contactos
	//	salir
		
		//recibir los datos desde teclado
		
	    int opcion =0;
	    String nombre;
		String numTelefono;
		String direccion;
		String buscontacto;
		
		List<Contacto> lista = new ArrayList<Contacto>();//jaa.util
		Contacto c = null;

		
	    do {
	    	System.out.println("1-. Ingresa un contacto");
	    	System.out.println("2-. Busca un contacto");
	    	System.out.println("3-. Edita un contacto");
	    	System.out.println("4-. Elimina un contacto");
	    	System.out.println("5-. Mostrar contactos");
	    	System.out.println("6-. salir");
	    	
	    	  try {
	    	System.out.println("Selecciona una Opcion");
	    	opcion=scan.nextInt();
	    	
	    	
	    	String elimina;
			switch(opcion) {
	    	case 1:
	    		
	    		System.out.println("Ingresa el nombre : ");
	    	    nombre=scan.next();
	    	    System.out.println("Ingresa el telefono : ");
	    	    numTelefono=scan.next();
	    	    System.out.println("Ingresa la direccion : ");
	    	    direccion=scan.next();
	    	    
	    	    c= new Contacto(nombre,numTelefono, direccion);
	    	    lista.add(c);
	    	  
	    	    break;
	    	
	    case 2:
    		
    		System.out.println("Busca el nombre del contacto : ");
    	nombre =scan.nextLine();
    	for(int i = 0;i <args.length; i++) {
    		if(lista.get(i).getNombre().equals(nombre)) {
    			c=lista.get(i);
    		}
    	}
    		
    	  if(c!=null) {
    		  System.out.println("contacto: "+c);
    	  }else {
    		  System.out.println("el contacto no existe");
    	  }
    	  
    	    break;
			  
	    	case 3:
    		
    		System.out.println("ingresa el nombre del contacto : ");
    	 nombre = scan.nextLine();
   
    	 for(int i=0; i<args.length; i++) {
    		 
    		 if(lista.get(i).getNombre().equals(nombre)) {
    			 
    			 System.out.println("Ingresa el nuevo telefono");
    			 numTelefono=scan.nextLine();
    			 System.out.println("Ingresa la nueva direccion");
    			 direccion=scan.nextLine();
    			 lista.get(i).setDireccion(direccion);
    			 lista.get(i).setNumTelefono(numTelefono);
    			 break;
    		 }
    	 }
    	    break;
	    	 case 4:
	     		
	    		 System.out.println("nombre del contacto : ");
	        	 nombre = scan.nextLine();
	       
	        	 for(int i=0; i<args.length; i++) {
	        		 
	        	 
	        		 if(lista.get(i).getNombre().equals(nombre)) {
	        			 lista.remove(i);
	        			 break;
	        			 
	        		 }
	        	 }	 
	        	
	    
	     	    break;
	    	 case 5:
	     		
	    		 for(int i=0; i<args.length; i++) {
	    			 System.out.println(lista.get(i));
	    		 }
	     	  
	     	    break;
    	    
    	
	    case 6:
            boolean salir = true;
            break;
        default:
            System.out.println("Solo números entre 1 y 6");
			}
	    	  } catch (InputMismatchException e) {
	    		  System.out.println("Debes insertar un número");
	    		  scan.next();
	    	  }
        
			
	    	
		}while(opcion>=1 && opcion<6);
	}	
}
