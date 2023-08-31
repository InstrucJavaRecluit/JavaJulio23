package common;

public class CalculadoraCientifica extends Calculadora implements OperacionesCientificas,FuncionesVarias{
	
	public CalculadoraCientifica() {
		
	}
	//metodos heredados que se sobre escriben
	public double multiplicar(double a, double b) {
		return a*b;
	}
	public double dividir(double a, double b) {
		return a/b;
	}
	@Override
	public double sumar(int a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double restar(int a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}
     //metodos implementados traidos de interfaz
	

	@Override
	public double seno(double angulo) {
		// TODO Auto-generated method stub
		return Math.sin(angulo);
	}

	@Override
	public double potencia(double base, int exponente) {
		// TODO Auto-generated method stub
		return Math.pow(base, exponente);
	}

	@Override
	public double raiz(double numero) {
		// TODO Auto-generated method stub
		return Math.sqrt(numero);
	}
	@Override
	public double funcionUno() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double funcionDos() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double funcionTres() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double funcionCuatro() {
		// TODO Auto-generated method stub
		return 0;
	}
}
