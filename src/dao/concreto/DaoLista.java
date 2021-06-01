package dao.concreto;

import java.util.ArrayList;
import java.util.List;

import acceso.coleccion.DAOCollection;
import modelo.Indicable;
import modelo.Persona;

public class DaoLista<T extends List, S extends Indicable<Comparable>, K> {
	private T lista;
	private String path;
	private DAOCollection<T> daoArchivo;

	public DaoLista(String path, List elementos) {
		super();
		this.path = path;
		this.daoArchivo = new DAOCollection<>(path);
		lista = daoArchivo.recupera();
		// personas == null
		if (lista == null) {
			lista = (T) elementos;
			daoArchivo.graba(lista);
		}
	}

	public boolean add(S s) {
		boolean add = lista.add(s);
		if (add) {
			add = daoArchivo.graba(lista);
			if (!add) {
				lista = daoArchivo.recupera();
			}
		}
		return add;
	}

	public S get(int posicion) {
		return (S) lista.get(posicion);
	}

	public S buscar(K id) {
		for (int i = 0; i < lista.size(); i++) {
			S s = (S) lista.get(i);
			if (s.getKey() == id) {
				return s;
			}

		}
		return null;
	}

	public boolean quitar(K id) {
		S busqueda = buscar(id);
		boolean respuesta = true;
		if (busqueda != null) {
			S remove = (S) lista.remove(lista.indexOf(busqueda));
			// ahora la version en memoria (ArrayList personas) es difente al del archivo
			if (remove != null) {
				respuesta = daoArchivo.graba(lista);
				if (!respuesta) {
					lista = daoArchivo.recupera();
				}
			}
		}
		return respuesta;
	}

}
