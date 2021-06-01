package modelo;

import java.io.Serializable;

public class ArticuloDTO implements Indicable<Comparable>, Serializable{
	
	private int id;
	private String nombre;
	
	
	
	public ArticuloDTO(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public Comparable getKey() {
		return id;
	}

	@Override
	public void setKey(Comparable t) {
		this.id=(int)t;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
