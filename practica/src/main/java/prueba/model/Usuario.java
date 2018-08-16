package prueba.model;

import java.util.Date;

public class Usuario {
private String nombre;
private String apellido;
private Date fecha_nac;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public Date getFecha_nac() {
	return fecha_nac;
}
public void setFecha_nac(Date fecha_nac) {
	this.fecha_nac = fecha_nac;
}
@Override
public String toString() {
	return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", fecha_nac=" + fecha_nac + "]";
}

}
