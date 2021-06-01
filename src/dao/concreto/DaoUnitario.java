package dao.concreto;

import acceso.multiobjeto.DAOMultiObjetos;
import modelo.Indicable;

public class DaoUnitario <T extends Indicable<Comparable>,K>{
	private String path;
	private DAOMultiObjetos<T, K> daoArchivo;
	
	public DaoUnitario(String path) {
		super();
		this.path = path;
		daoArchivo=new DAOMultiObjetos<>(path);
	}
	public boolean add(T t) {
		return daoArchivo.graba(t);
	}
	public T buscar(K k) {
		return daoArchivo.recupera(k);
	}
	public T get(int posicion) {
		return daoArchivo.recupera(posicion);
	}

}
