package trabajo;

public class cliente_vip extends cliente {
	public int descuento;

	public cliente_vip(String nombre, String apellido1, int ID, int tarifa, int descuento) {
		super(nombre, apellido1, ID, tarifa);
		this.descuento = 20;
	}
	public void setDescuento() {
		this.tarifa = tarifa - descuento;
	}
	public int getDescuento() {
		return tarifa;
	}
	
	
}
