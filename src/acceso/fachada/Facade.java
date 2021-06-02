package acceso.fachada;

import java.util.ArrayList;

import acceso.base.GrabadorSerializado;
import acceso.base.GrabadorTexto;
import acceso.base.RecuperadorIndexadoSerializado;
import acceso.base.RecuperadorIndexadoTexto;
import acceso.multiobjeto.DAOMultiObjetosGenerica;
import conversores.ConversorCancionDTO;
import dao.concreto.DaoLista;
import dao.concreto.DaoUnitario;
import modelo.ArticuloDTO;
import modelo.CancionDTO;
import modelo.Persona;

public class Facade {
	public DaoLista<ArrayList<Persona>, Persona, Integer> daoGente = new DaoLista<>("gente.dat",
			new ArrayList<Persona>());
	public DaoUnitario<ArticuloDTO, Integer> daoArticulo = new DaoUnitario<>("articulo.art",
			new DAOMultiObjetosGenerica("articulo.art", new GrabadorSerializado<>(),
					new RecuperadorIndexadoSerializado<>(), true));
	public DaoUnitario<String, String> daoCancion = new DaoUnitario<String, String>("cancion.can",
			new DAOMultiObjetosGenerica("cancion.can", new GrabadorTexto(), new RecuperadorIndexadoTexto(), true));

	public boolean add(CancionDTO cancionDTO) {
		return daoCancion.add(new ConversorCancionDTO().convertirAString(cancionDTO));
	}

	public boolean add(Persona s) {
		return daoGente.add(s);
	}

	public boolean add(ArticuloDTO t) {
		return daoArticulo.add(t);
	}

	public CancionDTO getCancion(int posicion) {
		return new ConversorCancionDTO().convertirAObjeto(daoCancion.get(posicion));
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
