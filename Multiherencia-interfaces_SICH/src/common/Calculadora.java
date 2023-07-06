package common;

public abstract class Calculadora {
//Clase abstracta
	
	String color;
	String marca;
	String modelo;
	
	public Calculadora() {
		
	}

	public Calculadora(String color, String marca, String modelo) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Calculadora [color=" + color + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	//Metodo Abstracto- que voy a hacer
	//Abstraccion es el proceso sintetizamos acciones que le atribuimos a los objetos
	public abstract double sumar(int a, double b);
	public abstract double restar(int a, double b);
	
	
}
