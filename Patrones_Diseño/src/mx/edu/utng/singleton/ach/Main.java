package mx.edu.utng.singleton.ach;

public class Main {

	public static void main(String[] args) {
		Usuario usu = Usuario.getUsuario("Alejandro", "Carranco");

		System.out.print(usu.getNombre());

		System.out.println(" " + usu.getApeido());

	}

}
