package common;
//clase abstracta
public abstract class Calculadora {

	
	
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

	
	//metodo abstracto que 
	//separar el que del como
	
	public abstract double sumar(int a, double b);
	public abstract double restar(int a, double b);
	
	
	
}