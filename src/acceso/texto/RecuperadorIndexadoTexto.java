package acceso.texto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import acceso.base.IRecuperadorIndexado;

public class RecuperadorIndexadoTexto<String,K> implements IRecuperadorIndexado<String,K> {

	@Override
	public String recupera(java.lang.String path, K k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String recupera(java.lang.String path, int posicion) {
		File file = new File(path);
		FileReader flujoR;
		BufferedReader buferR;
		String t=null;
		if(file.exists()) {
			try {
				flujoR=new FileReader(file);
				buferR=new BufferedReader(flujoR);
				t=(String) buferR.readLine();
				int contador=0;
				while(t!=null) {
					if(posicion==contador) {
						return t;
					}
					contador++;
					t=(String) buferR.readLine();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		return null;
	}



}
