package acceso.multiobjeto;

import acceso.base.DAOGrabador;
import acceso.base.IGrabador;
import acceso.base.IRecuperadorIndexado;
import modelo.Indicable;

public class DAOMultiObjetosGenerica<T , K> extends DAOGrabador<T> {
	protected final IRecuperadorIndexado<T, K> recuperador;
	protected boolean add = true;

	public DAOMultiObjetosGenerica(String path, IGrabador<T> grabador, IRecuperadorIndexado<T, K> recuperado,
			boolean add) {
		super(path, grabador);
		this.recuperador = recuperado;
		this.add = add;
	}

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
