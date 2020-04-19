package trabajo;

public class operario {
	public String nombre,apellido1;
	public int ID;
	public operario(String nombre, String apellido1, int ID) {
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.ID=ID;
		// TODO Auto-generated constructor stub
	}
	public void getDatos() {
		System.out.printf("%-20s%-20s-%-20d\n",nombre,apellido1,ID);
	}

}
