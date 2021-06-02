package dao.multiobjeto;

import acceso.base.IGrabador;
import acceso.base.IRecuperadorIndexado;

public class DAOMultiObjetosGenerica<T , K> {
	protected final IRecuperadorIndexado<T, K> recuperador;
	protected final IGrabador<T> grabador;
	protected boolean add = true;
	private String path;

	public DAOMultiObjetosGenerica(String path, IGrabador<T> grabador, IRecuperadorIndexado<T, K> recuperado,
			boolean add) {
		super();
		this.path=path;
		this.grabador=grabador;
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
