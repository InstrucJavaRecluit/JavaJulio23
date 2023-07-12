package common;
import java.util.HashMap; 
import java.util.Scanner;

public class  MetodoHashMap{
	public static void main(String[] args) {
		HashMap<String, Contacto> agenda = new HashMap<String, Contacto>();
		Scanner tec = new Scanner(System.in);
		int opcion=0;
		String nombre="";
		String numTelefono="";
		String direccion="";
		
		
		
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
			
			 System.out.println(nombre);
			 
			 c= new Contacto(nombre, numTelefono, direccion);
			 agenda.put(nombre,c);
			 break;
			 
			 case 2:
				 System.out.println("INGRESA EL NOMBRE DEL CONTACTO");
				 nombre =   tec. nextLine();
				 //BUSCA EN LA LISTA EL CONTACTO DESEADO
				 for (int i = 0; i  < agenda.size(); i++) {
					 if (agenda.get(i).getNombre().equals(nombre)){
						 agenda.get(nombre);
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
			
				 for (int i = 0; i  < agenda.size(); i++) { 
					 if (agenda.get(i).getNombre().equals(nombre)){
						 
						 System.out.println("INGRESA EL NUEVO NUMERO DE TELEFONO");
						 numTelefono =  tec.nextLine();
						 System.out.println("INGRESA LA NUEVA DIRECCION");
						 direccion =  tec.nextLine();
						 
						 agenda.get(i).setDireccion (direccion);
						 agenda.get(i).setNumTelefono (direccion);
						 break;
					 }
				 }
				 break; 
			 case 4:
				 System.out.println("INGRESA EL NOMBRE DEL CONTACTO");
				 nombre =   tec. nextLine();
				 for (int i = 0; i  < agenda.size(); i++) { 
					 if (agenda.get(i).getNombre().equals(nombre)){
						 
						 //ELIMINAR EL CONTACTO
						 agenda.remove(i);
				 break;
					 }
				 }
				
			 case 5:
//				 //imprime de forma vertical toda la lista<mostrar el contacto>
////			 for(String key: agenda.keySet()){
////				 System.out.println(key);
////						  System.out.println(agenda.get(key));
//						}
			 System.out.println(agenda.toString());
			 break;

		}
			 
	}while(opcion>=1 && opcion<6);
		 
	}

}

