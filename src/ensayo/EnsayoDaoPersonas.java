package ensayo;

import java.util.ArrayList;

import acceso.fachada.Facade;
import dao.concreto.DaoLista;
import dao.concreto.DaoPersonas;
import dao.concreto.DaoUnitario;
import modelo.ArticuloDTO;
import modelo.Persona;

public class EnsayoDaoPersonas {
	public static void main(String[] args) {
		Facade facade=new Facade();
		facade.add(new Persona(1, "Fulgencio"));
		facade.add(new ArticuloDTO(1, "tornillaco"));
		ArticuloDTO buscarArticuloDTO = facade.buscarArticuloDTO(1);
	}
}
