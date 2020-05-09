package com.atanas.utils;
import java.util.Scanner;

public class ScannerTools {

    /**
     * Pide por pantalla un numero entero.
     * @return Numero entero introduciodo por el usuario.
     */
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    /**
     * Muestra el enunciado y pide por pantalla un numero entero.
     * @param statement Enunciado que se mostrara antes de pedir el entero (En la misma linea).
     * @return Numero entero introduciodo por el usuario.
     */
    public static int getInt(String statement) {
        System.out.print(statement.trim() + " ");
        return new Scanner(System.in).nextInt();
    }

    /**
     * Pide por pantalla un string.
     * @return String introduciodo por el usuario.
     */
    public static String getString() {
        return new Scanner(System.in).nextLine().trim();
    }

    /**
     * Muestra el enunciado y pide por pantalla un string.
     * @param statement Enunciado que se mostrara antes de pedir el string (En la misma linea).
     * @return String introduciodo por el usuario.
     */
    public static String getString(String statement) {
        System.out.print(statement.trim() + " ");
        return new Scanner(System.in).nextLine().trim();
    }

    /**
     * Muestra los elementos del array y pide una opción hasta que se inserte una valida.
     * @param list Array de String que contiene las opciones que se podran seleccionar.
     * @return La posición en el array de la opción seleccionada.
     */
    public static int listSelect(String[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(i+") ");
            System.out.println(list[i]);
        }
        boolean invalid;
        int option;
        do {
            invalid = false;
            option = getInt("Seleccione una opción:");
            if (option < 0 || option >= list.length) {
                System.out.println("Opción seleccionada invalida.");
                invalid = true;
            }
        } while (invalid);
        return option;
    }
}
