/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
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

    @Override
    public String toString() {
        return "Requerimiento3 [numero1=" + numero1 + ", numeroInvertido=" + numeroInvertido + "]";
    }
}
