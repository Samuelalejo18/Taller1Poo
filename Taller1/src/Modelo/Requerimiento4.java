/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
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

    public String evaluarPositivoCeroNegativo() {
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

    @Override
    public String toString() {
        return "Requerimiento4 [numero1=" + numero1 + "]";
    }
}
