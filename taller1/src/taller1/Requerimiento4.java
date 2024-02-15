package taller1;

//Cree un programa OO que solicite un número e imprima si es positivo, evalué el caso de ser cero. 
public class Requerimiento4 {
	private int numero1;

	public Requerimiento4() {

	}

	public Requerimiento4(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public String positivoCero() {
		String numeroPositivo;
		String numeroNegativo;
		String numeroCero;

		if (numero1 > 0) {
			return numeroPositivo = " positivo";
		} else if (numero1 < 0) {
			return numeroNegativo = " negativo";
		} else {
			return numeroCero = " cero";
		}

	}
}