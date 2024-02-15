package taller1;

//Cree un programa OO que solicite un numero de dos dígitos e imprima su inverso. 
public class Requerimiento3 {
	private int numero1;
	private int numeroInvertido;

	public Requerimiento3() {

	}

	public Requerimiento3(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int invertir() {

		String numCadena = String.valueOf(numero1);

		String cadenaInvertida = "";
		for (int i = numCadena.length() - 1; i >= 0; i--) {
			cadenaInvertida += numCadena.charAt(i);

		}
		return numeroInvertido = Integer.parseInt(cadenaInvertida);
	}

}