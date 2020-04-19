package trabajo;
import java.util.*;
public class eventos {

	private String nombre, fecha, localizacion;
	private int precio;
	public eventos(String nombre, String fecha, int precio, String localizacion) {
		this.fecha=fecha;
		this.nombre=nombre;
		this.localizacion=localizacion;
		this.precio=precio;
	}
	public String getNombre() {
		return nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public int getPrecio() {
		return precio;
	}
	public void getDatos() {
		
		System.out.printf("%-35s%-20s%-20d%-20s\n",nombre,fecha,precio,localizacion);
		
	}
	
}
