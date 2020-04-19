package trabajo;
import java.util.*;
public class cliente {
	Scanner s1 = new Scanner(System.in);
	private String nombre,apellido1;
	public int ID,tarifa;
	private ArrayList<cliente> misClientes;
	public cliente(String nombre, String apellido1, int ID,int tarifa) {
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.ID=ID;
		this.tarifa=120;
		// TODO Auto-generated constructor stub
	}
	public cliente() {
		misClientes = new ArrayList<cliente>();
		misClientes.add(new cliente("manolito","gafotas",001,tarifa));
		misClientes.add(new cliente("fabio","gómez",002,tarifa));
		misClientes.add(new cliente("maría","pérez",003,tarifa));
		misClientes.add(new cliente("estefanía","serrano",004,tarifa));
		misClientes.add(new cliente("pepito","de_crema",005,tarifa));
	}
	public void setNuevoCliente() {
		boolean salir = false;
		while(!salir) {
		System.out.println("¿desea inscribirse en nuestra plataforma?(si/no)");
		String opcion = s1.nextLine();
		if(opcion.equalsIgnoreCase("Si")) {
			System.out.println("Introduzca su nombre, por favor:");
			String nombre= s1.nextLine();
			System.out.println("Introduzca su primer apellido, por favor");
			String apellido1= s1.nextLine();
			System.out.println("introduzca su ID, por favor:");
			int ID = s1.nextInt();
			misClientes.add(new cliente(this.nombre,this.apellido1,this.ID,tarifa));
		}
		else if(opcion.equalsIgnoreCase("no")) {
			salir = true;
		}
		}
		
	}
	

	
}
