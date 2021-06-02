package acceso.coleccion;

import java.util.Collection;

import acceso.base.DAOGrabador;
import acceso.base.GrabadorSerializado;
import acceso.base.IRecuperadorUnitario;
import acceso.base.RecuperadorUnitarioSerializado;


public class DAOCollection<T extends Collection> extends DAOGrabador<T> {
	private final IRecuperadorUnitario<T> recuperador;
	private final boolean add=false;

	public DAOCollection(String path) {
		super(path,new GrabadorSerializado<T>());		
		this.recuperador = new RecuperadorUnitarioSerializado<>();
	}

	@Override
	public boolean graba(T DTO) {
		return grabador.graba(this.path, DTO, add);
	}

	public T recupera()  {
			return recuperador.recupera(this.path);
	}

}
