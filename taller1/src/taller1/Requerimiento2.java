package taller1;

//Cree un programa OO que solicite tres números e imprima el mayor, el menor y el intermedio 
public class Requerimiento2 {
	private int numero1;
	private int numero2;
	private int numero3;

	public Requerimiento2() {

	}

	public Requerimiento2(int numero1, int numero2, int numero3) {

		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getNumero3() {
		return numero3;
	}

	public void setNumero3(int numero3) {
		this.numero3 = numero3;
	}

	public int mayor() {
		int mayor = 0;
		if (numero1 > numero2 && numero1 > numero3) {
			mayor = numero1;
		} else if (numero2 > numero1 && numero2 > numero3) {
			mayor = numero2;
		} else if (numero3 > numero1 && numero3 > numero2) {
			mayor = numero3;
		}
		return mayor;

	}

	public int intermedio() {
		int medio = 0;
		if ((numero1 > numero2 && numero1 < numero3) || (numero1 < numero2 && numero1 > numero3)) {
			medio = numero1;
		} else if ((numero2 > numero1 && numero2 < numero3) || (numero2 < numero1 && numero2 > numero3)) {
			medio = numero2;
		} else if ((numero3 > numero2 && numero3 < numero1) || (numero3 < numero2 && numero3 > numero1)) {
			medio = numero3;
		}
		return medio;

	}

	public int menor() {
		int menor = 0;
		if (numero1 < numero2 && numero1 < numero3) {
			menor = numero1;
		} else if (numero2 < numero1 && numero2 < numero3) {
			menor = numero2;
		} else if (numero3 < numero1 && numero3 < numero2) {
			menor = numero3;
		}
		return menor;

	}
}
