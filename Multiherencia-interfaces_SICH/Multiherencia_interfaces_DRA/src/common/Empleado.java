package common;

public class Empleado extends Persona {
	
    String puesto;
	double salario;
	String prestaciones;
	
	
	public Empleado(String nombre,String apellidos,int edad,String sexo,String direccion,String puesto, double salario, String prestaciones) {
		this.nombre  = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
		this.direccion = direccion;
		this.puesto = puesto;
		this.salario = salario;
		this.prestaciones = prestaciones;
	}


	public String getPuesto() {
		return puesto;
	}


	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getPrestaciones() {
		return prestaciones;
	}


	public void setPrestaciones(String prestaciones) {
		this.prestaciones = prestaciones;
	}


	@Override
	public String toString() {
		return "Empleado [puesto=" + puesto + ", salario=" + salario + ", prestaciones=" + prestaciones + "]";
	}
	
	
	
}

