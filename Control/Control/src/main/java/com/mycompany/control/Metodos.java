package com.mycompany.control;

import java.util.Scanner;

public class Metodos {

    Scanner leer = new Scanner(System.in);
    int num;

    public void validar() {
        while (num < 10) {
            System.out.println("El numero ingresado es menor a 10");
            System.out.println("Intenta nuevamente.");
            System.out.println("Ingrese un numero mayor a 10: ");
            num = leer.nextInt();
        }
    }

    public boolean invertirNumero() {
        System.out.println("Ingresa un numero mayor o igual a dos digitos: ");
        num = leer.nextInt();
        validar();

        String numeroStr = Integer.toString(num);
        String numeroInvertido = "";

        for (int i = numeroStr.length() - 1; i >= 0; i--) {
            numeroInvertido += numeroStr.charAt(i);
        }
        System.out.println("El numero invertido es: " + numeroInvertido);
        return false;
    }
}
