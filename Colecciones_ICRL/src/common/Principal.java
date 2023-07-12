package common;
import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	
	public static void main(String[] args) {
		//list es una interface
		//Array  es una lista que implementa a ala interface
		 List<Integer>numeros = new ArrayList<Integer>();//java.util
		 
		 //ver el tamaño dela lista
		 System.out.println(numeros.size());
		 
		 //agregar valores a la lista}
		 
		 numeros.add(128);
		 numeros.add(234);
		 numeros.add(546);
		 numeros.add(76985);
		 numeros.add(4657);
		 numeros.add(34576);
		 numeros.add(364456);
		 
		 System.out.println(numeros);
		 
		 
		 //eliminar elementos de la lista
		 numeros.remove(new Integer(546));
		 System.out.println(numeros);
		 
//		 //vacia la lista
//		 numeros.clear();
//		 System.out.println(numeros);
//		 
	  //valida si existe el elemento dentrode la lista si permite elementos repetidos
		 System.out.println(numeros.contains(new Integer(234)));
		 //nos devuelava el indice donde se encuentra el objeto
		 System.out.println(numeros.indexOf(new Integer(4657))); 
		 //devuelve si la lista esta vacia
		 System.out.println(numeros.isEmpty());
		 //devuelve el ultimo indice donde se encuentra un determinado valor
		 System.out.println(numeros.lastIndexOf(new Integer(234)));
		 //devuelve el elemento en la pocision indicada
		 System.out.println(numeros.get(2));
		 
		 //reemplaza el valor de la pocision indicada con el valor que le asignes
		 System.out.println(numeros.set(2, new Integer(111111)));
		 System.out.println(numeros);
		 // Inserta un nuevo valor a la lista de posicion indicada 
		 numeros.add(3, new Integer(222222));
		 System.out.println(numeros);
		 
		 Object[] objetos = numeros.toArray();
		 System.out.println(objetos[4]);
		 
			
	}
	
	

}
