package common;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		int opcion=0;
		String nombre;
		String numTelefono;
		String direccion;
		Scanner tec = new Scanner(System.in);
		List<Contacto>lista = new ArrayList<Contacto>();
		Contacto c = null;
		 
				
		do { 
			 System.out.println("1:-INGRESE EL CONTACTO");
			 System.out.println("2:-BUSCA EL CONTACTO");
			 System.out.println("3:-EDITAR EL CONTACTO");
			 System.out.println("4:-ELIMINAR EL CONTACTO");
			 System.out.println("5:-MOSTAR UN CONTACTO");
			 System.out.println("6:-SALIR");
			 System.out.println("SELECCIONE UNA OPCION");
			 opcion = tec.nextInt();
			 
			 
			 switch(opcion) {
			 
			 
			 case 1:
		     tec.nextLine();
			 System.out.println("INGRESA EL NOMBRE");
			 nombre =   tec. nextLine();
			 
			 System.out.println("INGRESE EL TELEFONO");
			 numTelefono =  tec.nextLine();
			 
			 System.out.println("INGRESA LA DIRECCION");
			 direccion =  tec.nextLine();
			
			 c= new Contacto(nombre, numTelefono, direccion);
			 lista.add(c);
			 break;
			 
			 case 2:
				 System.out.println("INGRESA EL NOMBRE DEL CONTACTO");
				 nombre =   tec. nextLine();
				 //BUSCA EN LA LISTA EL CONTACTO DESEADO
				 for (int i = 0; i  < args.length;  i++) {
					 if (lista.get(i).getNombre().equals(nombre)){
						 c= lista.get(i);
						 break;
					 }
				 }
                 
				 if (c !=null) {
					 System.out.println("Contacto:" + c);
				 }else {
					 System.out.println("El contacto no existe");
                 }
				 break;
			 
			 case 3:
				 System.out.println("INGRESA EL NOMBRE DEL USUARIO");
				 nombre =   tec. nextLine();
			
				 for (int i = 0; i  < args.length;  i++) {
					 if (lista.get(i).getNombre().equals(nombre)){
						
						 System.out.println("INGRESA EL NUEVO NUMERO DE TELEFONO");
						 numTelefono =  tec.nextLine();
						 System.out.println("INGRESA LA NUEVA DIRECCION");
						 direccion =  tec.nextLine();
						 
						 lista.get(i).setDireccion (direccion);
						 lista.get(i).setNumTelefono (direccion);
						 break;
					 }
				 }
				 break; 
			 case 4:
				 System.out.println("INGRESA EL NOMBRE DEL CONTACTO");
				 nombre =   tec. nextLine();
				 for (int i = 0; i  < args.length;  i++) {
					 if (lista.get(i).getNombre().equals(nombre)){
						 //ELIMINAR EL CONTACTO
						 lista.remove(i);
				 break;
					 }
				 }
				
			 case 5:
				 //imprime de forma vertical toda la lista<mostrar el contacto>
				 for (int i = 0; i  < args.length;  i++) {
					 System.out.println(lista.get(i));
				 }
				 break;
			
		}
			 
	}while(opcion>=1 && opcion<6);
		 
	}

}


