package common;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		//List es una interface
		//ArrayList es una clase que implementa esta interface
		List<Integer> numeros = new ArrayList<Integer>(); //java.util.*
		
		//Ver el tamaño de la lista
		System.out.println(numeros.size());
		
		//Agregar valores a la lista
		numeros.add(129);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		System.out.println(numeros);
		
		//Eliminar valores 
		//numeros.remove(3);
		numeros.remove(new Integer(2));
		System.out.println(numeros);
		
		//Vaciar la lista
//		numeros.clear();
//		System.out.println(numeros);
		
		//Validar si existe un elemento dentro de la lista
		System.out.println(numeros.contains(4));
		//Nos devuelve el indice donde encuentra el objeto señalado
		System.out.println(numeros.indexOf(1));
		//Devuelve si la lista esta vacia o no
		System.out.println(numeros.isEmpty());
		//Devuekve el ultimo indice donde encuentra un determinado valor
		System.out.println(numeros.lastIndexOf(new Integer(3)));
		System.out.println();
		//Devuelve el valor en la osicion indicada
		System.out.println(numeros.get(0)+"\n");
		//Reemplaza el valor de la posicion indicada con el valor que asigne
		System.out.println(numeros.set(1, new Integer(100)));
		System.out.println(numeros);
		
		//INsertar un nuevo valor a la lista, en la posicion indicada
		numeros.add(1, new Integer(100));
		System.out.println(numeros);
		
		Object[] objetos = numeros.toArray();
		System.out.println(objetos[4]);
		
	}

}
