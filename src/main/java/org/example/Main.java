package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Scanner keyBoard=new Scanner(System.in);
    //Se delcaran las variables

        String nombre;
        String apellidos;
        int edad;
        int numeroUsosTarjeta;
        Double montoComprasAseo;
        Double montoComprasAlimentos;
        Double montoComprasOtros;
        Double totalDescuento;
        Double totalDeuda;
        short puntajeCredito;

        //Se inicializan las variables

        System.out.println("BIENVENIDO A TUYA");
        System.out.println("💸💸💸💸💸💸💸💸💸💸💸💸💸💸");
        System.out.println("Por favor digite los siguientes datos e información");

        System.out.print("Digite su nombre: ");
        nombre=keyBoard.nextLine();

        System.out.print("Digite sus apellidos: ");
        apellidos=keyBoard.nextLine();

        System.out.print("Digite su edad: ");
        edad=keyBoard.nextInt();

        System.out.print("Digite el numero de usos de la tarjeta durante el último mes: ");
        numeroUsosTarjeta=keyBoard.nextInt();

        System.out.print("Digita el monto de compras de productos de aseo comprados con la tarjeta: $");
        montoComprasAseo=keyBoard.nextDouble();

        System.out.print("Digita el monto de compras de productos alimenticios comprados con la tarjeta: $");
        montoComprasAlimentos=keyBoard.nextDouble();

        System.out.print("Digita el monto de otros productos comprados con la tarjeta: $");
        montoComprasOtros=keyBoard.nextDouble();

        System.out.print("Digite su puntaje de crédito: ");
        puntajeCredito = keyBoard.nextShort();

        totalDeuda=montoComprasAseo+
                montoComprasAlimentos+
                montoComprasOtros;

        totalDescuento = totalDeuda;
    //Salida del programa

            if (puntajeCredito == 1) {
                totalDescuento = totalDeuda * 0.25;
        } else if (puntajeCredito == 2) {
                totalDescuento = totalDeuda * 0.20;
        } else if (puntajeCredito == 3) {
                totalDescuento = totalDeuda * 0.15;
        } else if (puntajeCredito == 4) {
                totalDescuento = totalDeuda * 0.10;
        }
            System.out.println("Señor@ "+ nombre+", el valor a pagar de la deuda con descuento es por un valor de: $"+totalDescuento+" pesos.");

    }
}