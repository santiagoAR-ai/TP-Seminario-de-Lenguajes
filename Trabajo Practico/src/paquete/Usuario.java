package paquete;

public class Usuario {
private String nombre;
private String apellido;
private int Nro_telefono;
public Usuario(String nombre,String apellido) {
	this.nombre=nombre;
	this.apellido=apellido;
}

public String getNombre() {
	return nombre;
}
public String getApellido() {
	return apellido;
}
public int getNro_telefono() {
	return Nro_telefono;
}
}
