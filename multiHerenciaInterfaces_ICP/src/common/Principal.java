package common;

public class Principal {
	
	public static void main(String[] args) {
		
		//Calculadora cal = new Calculadora();
		calBasica cb = new calBasica();
		
		
		System.out.println(cb.sumar(3, 8.6));
		System.out.println(cb.restar(3, 8.6));
	}
}
