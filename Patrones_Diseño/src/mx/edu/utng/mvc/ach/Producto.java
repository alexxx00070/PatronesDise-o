package mx.edu.utng.mvc.ach;

public class Producto {
	public String nombre;
	public String marca;
	public double precio;
	
	public Producto() {

	}

	public Producto(String nombre, String marca, double prcio) {
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
