package common;

public class Contacto {

	
	String nombre;
	String numTelefono;
	String direccion;
	
	public Contacto() {
		
	}

	public Contacto(String nombre, String numTelefono, String direccion) {
		this.nombre = nombre;
		this.numTelefono = numTelefono;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", numTelefono=" + numTelefono + ", direccion=" + direccion + "]";
	}
	
	
	
}
