package paquete;

public class Veterinario extends Usuario{
private String titulo;
public Veterinario(String nombre, String apellido, String titulo) {
	super(nombre,apellido);
	this.titulo=titulo;
}
public String gettitulo() {
	return titulo;
}

}
