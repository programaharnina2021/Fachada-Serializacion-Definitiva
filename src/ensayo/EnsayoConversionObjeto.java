package ensayo;

import modelo.CancionDTO;

public class EnsayoConversionObjeto {
	public static void main(String[] args) {
		// grabar un objeto como String
		CancionDTO cancion = new CancionDTO("hola", 345, true);
		String titulo = cancion.getKey();
		String duracion = String.valueOf(cancion.getDuracionEnSegundos());
		String estrenada = String.valueOf(cancion.isEstrenada());
		String total = titulo + ";" + duracion + ";" + estrenada + "\n";
		StringBuilder permiteAnadir = new StringBuilder();
		permiteAnadir.append(total);
		permiteAnadir.append(total);
		System.out.println(permiteAnadir.toString());
	
		String[] objetos = permiteAnadir.toString().split("\n");
		for (int i = 0; i < objetos.length; i++) {
			System.out.println("objeto " + i + " " + objetos[i]);
			String[] propiedades = objetos[i].split(";");
			CancionDTO miCancion=new CancionDTO(propiedades[0],Long.valueOf(propiedades[1]), 
					Boolean.valueOf(propiedades[2]));
			System.out.println(miCancion.toString());
		}

	}
}
