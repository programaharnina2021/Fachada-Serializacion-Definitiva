package acceso.fachada;

import java.util.ArrayList;

import dao.concreto.DaoLista;
import dao.concreto.DaoPersonas;
import dao.concreto.DaoUnitario;
import modelo.ArticuloDTO;
import modelo.Persona;

public class Facade {
	public DaoLista<ArrayList<Persona>, Persona, Integer> daoGente = new DaoLista<>("gente.dat", new ArrayList<Persona>());
	public DaoUnitario<ArticuloDTO, Integer> daoArticulo = new DaoUnitario<>("articulo.art");
	
	public boolean add(Persona s) {
		return daoGente.add(s);
	}
	public boolean add(ArticuloDTO t) {
		return daoArticulo.add(t);
	}
	
	public Persona getPersona(int posicion) {
		return daoGente.get(posicion);
	}
		
	public boolean quitarPersona(Integer id) {
		return daoGente.quitar(id);
	}
	
	public Persona buscarPersona(Integer k) {
		return daoGente.buscar(k);
	}
	
	public ArticuloDTO buscarArticuloDTO(Integer k) {
		return daoArticulo.buscar(k);
	}
	
}
