package mx.edu.utng.singleton.ach;

public class Usuario {
	private String nombre;
	private String apeido;
	private static Usuario usuario;

	public static Usuario getUsuario(String nombre, String apeido) {
		if (usuario == null) {
			usuario = new Usuario(nombre, apeido);
		}
		return usuario;
	}

	private Usuario(String nombre, String apeido) {
		this.nombre = nombre;
		this.apeido = apeido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApeido() {
		return apeido;
	}

	public void setBaseApeido(String apeido) {
		this.apeido = apeido;
	}
}
