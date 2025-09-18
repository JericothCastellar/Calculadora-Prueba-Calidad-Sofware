/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author leofa
 */


public class PruebasUnitarias {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("2 + 3 = " + calc.sumar("2", "3"));
        System.out.println("10 / 5 = " + calc.dividir("10", "5"));
        System.out.println("5 - 5 = " + calc.restar("5", "5"));
        System.out.println("2 * 10 = " + calc.multiplicar("2", "10"));
    }
}
