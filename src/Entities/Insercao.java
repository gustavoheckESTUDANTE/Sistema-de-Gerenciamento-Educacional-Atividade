package Entities;


import Exceptions.InsercaoInvalidaException;

import java.util.Scanner;

public class Insercao {
    private static final Scanner SC = new Scanner(System.in);

    public static String inserString () {
        String valor = SC.next();
        try {
            if (valor.isEmpty()) {
                throw new InsercaoInvalidaException("Nenhum valor inserido");
            }
        } catch (Exception InsercaoInvalidaException) {
            System.out.println(InsercaoInvalidaException.getMessage());
            return null;
        }
        return valor;
    }

    public static Number inserNum (int min, int max) {
        int valor = SC.nextInt();
        try {
            if (valor < min || valor > max) {
                throw new InsercaoInvalidaException("Valor inválido inserido");
            }
        } catch (Exception InsercaoInvalidaException) {
            System.out.println(InsercaoInvalidaException.getMessage());
            return null;
        }
        return valor;
    }
}
