package Algoritmos.Ejercicio1_Palindromo.SinModular;

import java.text.Normalizer;
import java.util.Scanner;

public class PalindromeCheckerV1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("Ingresa una palabra y te diré si es o no un palindromo");
        String palabra = scanner.nextLine();

        boolean esPalindromo = true;

        String palabraNormalizada;
        String palabraLimpia;

        palabraNormalizada = Normalizer.normalize(palabra, Normalizer.Form.NFD);

        for (int i = 0; i < palabraNormalizada.length(); i++){

            char letra = palabraNormalizada.charAt(i);

            if (Character.isLetter(letra)){
                stringBuilder.append(letra);
            }
        }

        palabraLimpia = stringBuilder.toString();

        for (int i = 0; i < palabraLimpia.length() / 2 ; i++) {

            char letra1 = Character.toLowerCase(palabraLimpia.charAt(i));
            char letra2 = Character.toLowerCase(palabraLimpia.charAt(palabraLimpia.length() - 1 - i));


            if(letra1 != letra2){
                esPalindromo = false;
                break;
            }

        }

        if (esPalindromo){
            System.out.println("La palabra " + palabraLimpia + " es un palíndromo");
        }else {
            System.out.println("La palabra " + palabraLimpia + " no es un palíndromo");

        }

        scanner.close();
    }
}
