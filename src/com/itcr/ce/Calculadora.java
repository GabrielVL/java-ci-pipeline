package com.itcr.ce;

import java.util.Scanner;

public class Calculadora {

    Scanner in = new Scanner(System.in);

    public void encender() {
        System.out.println("Ingresa un número y presiona Enter");
        int number = in.nextInt();
        String isOff = in.nextLine();
        definirOperacion(number);
        apagar(isOff);
    }

    public void definirOperacion(int num) {
        System.out.println(num + " ?");
        char character = in.next().charAt(0);
        hacerOperacion(num, character);
    }

    public void hacerOperacion(int num1, char op) {
        System.out.println(num1 + " " + op + " ?");
        int num2 = in.nextInt();
        switch (op) {
            case '+':
                definirOperacion(num1 + num2);
                break;
            case '-':
                definirOperacion(num1 - num2);
                break;
            case '*':
                definirOperacion(num1 * num2);
                break;
            case '/':
                definirOperacion(num1 / num2);
                break;
            default:
                System.out.println("Operación no válida");
                definirOperacion(num1);
        }
    }

    public void apagar(String mode) {
        if (mode.equals("off")) {
            System.exit(0);
        }
    }

}
