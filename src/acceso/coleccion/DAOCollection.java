package acceso.coleccion;

import java.util.Collection;

import acceso.base.IGrabador;
import acceso.base.IRecuperadorUnitario;
import dao.serializado.GrabadorSerializado;
import dao.serializado.RecuperadorIndexadoSerializado;
import dao.serializado.RecuperadorUnitarioSerializado;

public class DAOCollection<T extends Collection> {
	private final IRecuperadorUnitario<T> recuperador;
	protected IGrabador grabador;
	protected String path;
	private final boolean add = false;

	public DAOCollection(String path,IRecuperadorUnitario<T> recuperador,IGrabador grabador) {
		super();
		this.path=path;
		this.grabador = grabador;
		this.recuperador = recuperador;
	}

	public boolean graba(T DTO) {
		return grabador.graba(this.path, DTO, add);
	}

	public T recupera() {
		return recuperador.recupera(this.path);
	}

}
