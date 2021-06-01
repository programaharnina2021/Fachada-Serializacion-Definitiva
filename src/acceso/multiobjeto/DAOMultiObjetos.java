package acceso.multiobjeto;

import acceso.base.DAOGrabador;
import acceso.base.IRecuperadorIndexado;
import acceso.base.RecuperadorIndexado;
import modelo.Indicable;

public class DAOMultiObjetos<T extends Indicable, K> extends DAOGrabador<T> {
	private final IRecuperadorIndexado<T, K> recuperador;
	private final boolean add = true;

	public DAOMultiObjetos(String path) {
		super(path);
		recuperador = new RecuperadorIndexado<>();
	}

	@Override
	public boolean graba(T DTO) {
		return grabador.graba(path, DTO, add);
	}

	public T recupera(K k) {
		return recuperador.recupera(path, k);
	}

	public T recupera(int posicion) {
		return recuperador.recupera(path, posicion);
	}

}
