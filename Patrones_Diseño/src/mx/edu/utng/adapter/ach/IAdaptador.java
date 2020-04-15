package mx.edu.utng.adapter.ach;

public interface IAdaptador {
	public abstract void ingresarCajas(int piezas);

	public abstract void retirarCajas(int piezas);

	public abstract void ingresarPiezas(int piezas);

	public abstract void retirarPiezas(int piezas);
}
