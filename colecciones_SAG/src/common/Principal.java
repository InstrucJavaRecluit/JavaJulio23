package common;

import java.util.ArrayList;

import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
	//list es una interfaz
		
		List<Integer> numeros = new ArrayList<Integer>();//jaa.util
		
		
		//ver tamaño de lista con metodo size
		System.out.println(numeros.size());
	//agregamos valores a la lista
		
		numeros.add(128);
		numeros.add(234);
		numeros.add(346);
		numeros.add(567);
		numeros.add(986);
		numeros.add(45678);
		numeros.add(56);
		numeros.add(56);
		System.out.println(numeros);
		
		//eliminar elementos de la lista index
		numeros.remove(4);
		//eliminar elemento de la lista object o le esta pasando objetos new Integer(128)
		numeros.remove(new Integer(128));
		System.out.println(numeros);
		
		///////metodo clear vacia la lista
//		numeros.clear();
//		System.out.println(numeros);
		
		//valida si existe un elemento dentro de la lista
		System.out.println(numeros.contains(new Integer(234)));
		
		//devolvera el indice en donde lo encontro
		System.out.println(numeros.lastIndexOf(new Integer(56)));
		
		//deuelve si la lista esta vacia o no la valida 
		System.out.println(numeros.isEmpty());
		
		//devuelve el ultimo indice si esta repetido
		System.out.println(numeros.lastIndexOf(new Integer(56)));
		
		//devuelve el elemento en la posicion indicada
		System.out.println(numeros.get(2));
		
		//remplaza el valor en la pocicion indicada con el valor que le asignes
		System.out.println(numeros.set(2, new Integer(1219)));
		System.out.println(numeros);
		
		//inserta un nuevo valor a la lista en la posicion indicada
		numeros.add(3, new Integer(1111111));
		System.out.println(numeros);
		
		//devuleve el valor especifico
		Object[] objetos=numeros.toArray();
		System.out.println(4);
	}

}

