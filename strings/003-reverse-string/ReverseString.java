package Algoritmos;

import java.util.Scanner;

public class ReverseString {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("Ingresa una palabra");
        String palabra = scanner.nextLine();

        for (int i = palabra.length() - 1; i >= 0; i--){

            char letra = palabra.charAt(i);

            stringBuilder.append(letra);

        }

        String palabraInvertida = stringBuilder.toString();
        System.out.println(palabraInvertida);

        scanner.close();

    }

}
