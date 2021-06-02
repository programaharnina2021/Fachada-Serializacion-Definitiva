package acceso.texto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import acceso.base.IGrabador;

public class GrabadorTexto<String> implements IGrabador<String> {

	@Override
	public boolean graba(java.lang.String path, String dto, boolean add) {
		boolean estado = false;
		File file = new File(path);
		FileWriter flujoW;
		BufferedWriter bufferW;
		try {
			boolean existe = file.exists();
			flujoW = new FileWriter(file, add);
			bufferW = new BufferedWriter(flujoW);
			bufferW.append((CharSequence) dto);
			bufferW.close();
			flujoW.close();
			estado = true;
		} catch (Exception e) {
			estado = false;
		}
		return estado;
	}

}
