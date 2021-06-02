package conversores;

import modelo.CancionDTO;
import modelo.Convertible;

public class ConversorCancionDTO implements Convertible<CancionDTO> {

	@Override
	public String convertirAString(CancionDTO t) {
		
		return  t.getKey() + ";" 
		+ String.valueOf(t.getDuracionEnSegundos()) + ";" 
				+ String.valueOf(t.isEstrenada()) + "\n";
	}

	@Override
	public CancionDTO convertirAObjeto(String string) {
		String[] propiedades = string.split(";");
		return new CancionDTO(propiedades[0], Long.valueOf(propiedades[1]), Boolean.valueOf(propiedades[2]));
	}

}
