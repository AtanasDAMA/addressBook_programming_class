package com.atanas.utils;
public class Menu {
    public static int menu(String[] statements, String statement) {
        for (int i = 0; i < statements.length; i++) {
            System.out.println(i+") "+statements[i]);
        }
        int option;
        do {
            option = ScannerTools.getInt(statement);

        } while (option < 0 || option >= statements.length);
        return option;
    }
}
