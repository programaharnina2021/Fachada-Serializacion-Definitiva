package ensayo;

import acceso.fachada.Facade;
import conversores.ConversorCancionDTO;
import modelo.ArticuloDTO;
import modelo.CancionDTO;
import modelo.Persona;

public class EnsayoDao {
	public static void main(String[] args) {
		Facade facade=new Facade();
//		facade.add(new Persona(1, "Fulgencio"));
//		facade.add(new ArticuloDTO(1, "tornillaco"));
//		ArticuloDTO buscarArticuloDTO = facade.buscarArticuloDTO(1);
		CancionDTO cancion = new CancionDTO("adios",112, true);
//		facade.add(cancion);
		CancionDTO otra=facade.getCancion(2);
		System.out.println(otra.toString());
	}
}
