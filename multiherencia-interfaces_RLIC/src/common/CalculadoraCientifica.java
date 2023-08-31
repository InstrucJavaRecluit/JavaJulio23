package common;

public class CalculadoraCientifica extends Calculadora implements OperacionesCientificas,FuncionesVarias {
	
	
	public CalculadoraCientifica () {
		
	}
	
	public double multiplicar(double a, double b) {
		return a*b;
	}
	public double dividir(double a, double b) {
		return a/b;
	}
	
     //2: metodos heradados se sobreescribe 
	@Override
	public double sumar(int a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double restar(int a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double seno(double angulo) {
		// TODO Auto-generated method stub
		return  Math.sin(angulo);
	}


	@Override
	public double potencia(double base, int exponente) {
		// TODO Auto-generated method stub
		return  Math.pow(base, exponente);
	}
	


	@Override
	public double raiz(double numero) {
		// TODO Auto-generated method stub
		return  Math.sqrt(numero);
	}

	@Override
	public double funcionUno() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double funciondos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double funciotres() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double funcioncuatro() {
		// TODO Auto-generated method stub
		return 0;
	}
	}
	

	//Metodos implementarios traidos de interfaces
	
	//interface: No es visual 
	//interfaz de usuario
	
	
