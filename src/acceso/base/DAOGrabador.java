package acceso.base;

public abstract class DAOGrabador<T> {
	
	protected IGrabador grabador;
	protected String path;
	
	public DAOGrabador(String path,IGrabador<T> grabador) {
		super();
		this.grabador = grabador;
		this.path = path;
	}

	public abstract boolean graba(T DTO);
	
}
