package acceso.coleccion;

import java.util.Collection;

import acceso.DAOGrabador;
import acceso.IRecuperadorUnitario;
import acceso.RecuperadorUnitario;


public class DAOCollection<T extends Collection> extends DAOGrabador<T> {
	private final IRecuperadorUnitario<T> recuperador;
	private final boolean add=false;

	public DAOCollection(String path) {
		super(path);		
		this.recuperador = new RecuperadorUnitario<>();
	}

	@Override
	public boolean graba(T DTO) {
		return grabador.graba(this.path, DTO, add);
	}

	public T recupera()  {
			return recuperador.recupera(this.path);
	}

}
