package trabajo;
import java.util.*;
public class menu {
	static Scanner s1 = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		eventos Evento1 = new eventos("Octoberfest", "mayo",500 , "Munich");
		eventos Evento2 = new eventos("Festival del desierto de Jaisalmer","enero",1100,"Jaisalmer");
		eventos Evento3 = new eventos("Carnaval de Venecia","febrero",500,"venecia");
		eventos Evento4 = new eventos("Carnaval de Rio de Janeiro","febrero",1200,"Rio de Janeiro");
		eventos Evento5 = new eventos("Festival de Holi","febrero-marzo",1500,"Holi");
		eventos Evento6 = new eventos("Fiesta del agua de Songkran","abril",2000,"SongKran");
		eventos Evento7 = new eventos("Festival Burning Man","junio",1200,"Desierto de nevada");
		operario miOperario1 = new operario("vicente", "higuera",100);
		operario miOperario2 = new operario("Alejandro", "García",101);
		operario miOperario3 = new operario("Javier", "Sotoca",102);
		operario miOperario4 = new operario("Ignacio", "Guirado",103);
		boolean salir = false;
		while(!salir) {
		System.out.println("-------------------menu------------------");
		System.out.println("1. Entrar como cliente");
		System.out.println("2. Mirar los eventos");
		System.out.println("3. Conocer al personal");
		System.out.println("4. Salir");
		System.out.println("Introduzca una opción");
		int opcion = s1.nextInt();
		switch(opcion) {
		case 1:
			cliente miCliente = new cliente();
			boolean continuar = false;
			while(!continuar) {
				System.out.println("es usted cliente nuestro?(si/no)");
				String respuesta = s1.nextLine();
				if(respuesta.equalsIgnoreCase("si")) {
					System.out.println("Introduzca su nombre, por favor");
					String nombre = s1.nextLine();
					if(nombre=="manolito" && nombre=="fabio" && nombre=="maría" && nombre=="estefanía" && nombre=="pepito") {
						System.out.println("Bienvenido");
					}
					else {
						System.out.println("lo sentimos, pero su nombre no aparece en nuestra base de datos");
						miCliente.setNuevoCliente();
					}
				}
				if(respuesta.equalsIgnoreCase("no")) {
					miCliente.setNuevoCliente();
				}
				
			}
		case 2:
			
			System.out.printf("%-35s%-20s%-20s%-20s\n","Nombre","Fecha","Precio","Localización");
			System.out.println("-------------------------------------------------------------------------------------------------");
			Evento1.getDatos();
			Evento2.getDatos();
			Evento3.getDatos();
			Evento4.getDatos();
			Evento5.getDatos();
			Evento6.getDatos();
			Evento7.getDatos();

		case 3:
			System.out.println("Ésta es una lista de nuestros operarios:");
			System.out.printf("%-20s%-20s%-10s\n","Nombre","Apellido","ID");
			System.out.println("------------------------------------------------------");
			miOperario1.getDatos();
			miOperario2.getDatos();
			miOperario3.getDatos();
			miOperario4.getDatos();
			

		case 4:
			salir = true;
		}
		}	
	}

}

 