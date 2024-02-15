package taller1;

//Cree un programa OO que solicite dos números e imprima las operaciones matemáticas básicas incluido el modulo.
public class Requerimiento1 {
	private int numero1;
	private int numero2;

	public Requerimiento1() {

	}

	public Requerimiento1(int numero1, int numero2) {

		this.numero1 = numero1;
		this.numero2 = numero2;
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

	public int sumar() {
		return numero1 + numero2;
	}

	public int restar() {
		return numero1 - numero2;
	}

	public int multiplicar() {
		return numero1 * numero2;
	}

	public int dividir() {
		return numero1 / numero2;
	}

	public int modulo() {
		return numero1 % numero2;

	}
}