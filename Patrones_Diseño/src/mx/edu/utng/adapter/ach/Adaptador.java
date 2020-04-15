package mx.edu.utng.adapter.ach;

public class Adaptador implements IAdaptador {
	Existencias existencias = new Existencias();

	public Adaptador() {
	}

	public int getTotal() {
		return this.existencias.getTotalProductos();
	}

	@Override
	public void ingresarCajas(int piezas) {
		int productos = piezas * 25;
		existencias.altaProductos(productos);
	}

	@Override
	public void retirarCajas(int piezas) {
		int productos = piezas - 25;
		existencias.bajaProductos(productos);
	}

	@Override
	public void ingresarPiezas(int piezas) {
		int productos = piezas;
		existencias.altaProductos(productos);
	}

	@Override
	public void retirarPiezas(int piezas) {
		int productos = piezas;
		existencias.bajaProductos(productos);
	}
}
