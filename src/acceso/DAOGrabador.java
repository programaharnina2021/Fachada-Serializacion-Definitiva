package acceso;

public abstract class DAOGrabador<T> {
	
	protected IGrabador grabador;
	protected String path;
	
	public DAOGrabador(String path) {
		super();
		this.grabador = new Grabador<>();
		this.path = path;
	}

	public abstract boolean graba(T DTO);
	
}
