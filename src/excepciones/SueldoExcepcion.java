/**
 * 
 */
package excepciones;

import auxiliares.AuxMethod;

/**
 * @author Miguel A. Sastre
 *
 */
public class SueldoExcepcion extends Exception {
	
	private String texto;
	
	public SueldoExcepcion (String texto) {
		super(texto);
		this.texto = texto;
	}
	
	public void getMsg() {
		AuxMethod.mostrarInfo(this.getTexto());
	}

	/**
	 * @return the texto
	 */
	public String getTexto() {
		return texto;
	}
	
	
}
