package modelo;

import java.io.Serializable;

public class CancionDTO implements Serializable,Indicable<String>,Convertible<CancionDTO>{
	private String titulo;
	private long duracionEnSegundos;
	private boolean estrenada;

	public CancionDTO(String titulo, long duracionEnSegundos, boolean estrenada) {
		super();
		this.titulo = titulo;
		this.duracionEnSegundos = duracionEnSegundos;
		this.estrenada = estrenada;
	}

	@Override
	public String toString() {
		return super.toString()+"el titulo es "+this.titulo+" con una duracion de "+this.duracionEnSegundos ;
	}
	@Override
	public String getKey() {
		return this.titulo;
	}

	@Override
	public void setKey(String t) {
		this.titulo=t;
		
	}

	public long getDuracionEnSegundos() {
		return duracionEnSegundos;
	}

	public void setDuracionEnSegundos(long duracionEnSegundos) {
		this.duracionEnSegundos = duracionEnSegundos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (duracionEnSegundos ^ (duracionEnSegundos >>> 32));
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CancionDTO other = (CancionDTO) obj;
		if (duracionEnSegundos != other.duracionEnSegundos)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	public boolean isEstrenada() {
		return estrenada;
	}

	public void setEstrenada(boolean estrenada) {
		this.estrenada = estrenada;
	}

	@Override
	public String convertirAString(CancionDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CancionDTO convertirAObjeto(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
