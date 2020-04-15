package mx.edu.utng.adapter.ach;

public class Existencias {
	private int productos = 0;

	public Existencias() {
	}

	public int getTotalProductos() {
		return this.productos;
	}

	public void bajaProductos(int productos) {
		this.productos -= productos;
	}

	public void altaProductos(int productos) {
		this.productos += productos;
	}
}
