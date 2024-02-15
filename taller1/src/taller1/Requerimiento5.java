package taller1;

//Cree un programa OO que solicite un número e imprima si es par, evalué el caso de ser cero.
public class Requerimiento5 {
	private int numero1;

	public Requerimiento5() {

	}

	public Requerimiento5(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public String parCero() {
		String par;
		String cero;
		String impar;

		if (numero1 % 2 == 0) {
			return par = "par";
		} else if (numero1 == 0) {
			return cero = "cero";
		} else {
			return impar = "impar";
		}
	}
	@Override
	public String toString() {
		return "Requerimiento5 [numero1=" + numero1 + "]";
	}

}
