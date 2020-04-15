package mx.edu.utng.adapter.ach;

public class Main {

	public static void main(String[] args) {
		Adaptador conversor = new Adaptador();
		conversor.ingresarCajas(1);
		conversor.retirarPiezas(5);
		System.out.println("Total de productos: " + conversor.getTotal());
	}

}
