package ensayo;

import java.util.ArrayList;

import dao.concreto.DaoLista;
import dao.concreto.DaoPersonas;
import modelo.Persona;

public class EnsayoDaoPersonas {
	public static void main(String[] args) {
		DaoPersonas personas=new DaoPersonas();
		DaoLista<ArrayList<Persona>, Persona, Integer> daoGente;
		daoGente=new DaoLista<>("gente.dat", new ArrayList<Persona>());
//		personas.addPersona(new Persona(1, "Fulgencio"));
		daoGente.add(new Persona(1, "Fulgencio"));
		
	}
}
