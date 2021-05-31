package dao.concreto;

import java.util.ArrayList;

import acceso.coleccion.DAOCollection;
import modelo.Persona;

public class DaoPersonas {
	// T S
	private ArrayList<Persona> personas;
	private String path = "personas.dat";
	DAOCollection<ArrayList<Persona>> daoArchivoPersonas;

	public DaoPersonas() {
		super();
		daoArchivoPersonas = new DAOCollection<>(path);
		personas = daoArchivoPersonas.recupera();
		// personas == null
		if (personas == null) {
			personas = new ArrayList<>();
			daoArchivoPersonas.graba(personas);
		}
	}

	public boolean addPersona(Persona persona) {
		boolean add = personas.add(persona);
		if (add) {
			add = daoArchivoPersonas.graba(personas);
			if (!add) {
				personas = daoArchivoPersonas.recupera();
			}
		}
		return add;
	}

	// la clave de busqueda es K
	public Persona buscaPersona(int id) {
		for (Persona persona : personas) {
			if (persona.getId() == id) {
				return persona;
			}
		}
		return null;
	}

	public boolean quitarPersona(int id) {
		Persona buscaPersona = buscaPersona(id);
		boolean respuesta = true;
		if (buscaPersona != null) {
			Persona remove = personas.remove(personas.indexOf(buscaPersona));
			// ahora la version en memoria (ArrayList personas) es difente al del archivo
			if (remove != null) {
				respuesta = daoArchivoPersonas.graba(personas);
				if (!respuesta) {
					personas = daoArchivoPersonas.recupera();
				}
			}
		}
		return respuesta;
	}

}
