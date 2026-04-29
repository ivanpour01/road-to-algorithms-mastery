package Algoritmos.Ejercicio1_Palindromo.SinModular;

import java.text.Normalizer;
import java.util.Locale;
import java.util.Scanner;

public class PalindromeCheckerV2 {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una palabra y te diré si es o no es un palíndromo");
        String palabra = scanner.nextLine();

        if (palabra.trim().isEmpty()){
            System.out.println("Palabra ingresada inválida");
            scanner.close();
            return;
        }

        String palabraLimpia = limpiarTexto(palabra);

        if (palabraLimpia.isEmpty()){
            System.out.println("No quedaron caracteres válidos");
            scanner.close();
            return;
        }

        if (esPalindromo(palabraLimpia)){
            System.out.println("La palabra ingresada es un palíndromo");
        }else{
            System.out.println("La palabra ingresada no es un palíndromo");
        }

        scanner.close();

    }

    public static String limpiarTexto(String palabra){
        String palabraMinuscula = palabra.toLowerCase(Locale.ROOT);
        String palabraNormalizada = Normalizer.normalize(palabraMinuscula, Normalizer.Form.NFD);
        String palabraLimpia = palabraNormalizada.replaceAll("\\p{M}", "")
                .replaceAll("[^\\p{L}\\p{N}]", "");

        return palabraLimpia;
    }

    public static boolean esPalindromo(String palabra){

        for (int i = 0; i < palabra.length()/2; i++){

            if (!(palabra.charAt(i) == palabra.charAt(palabra.length() - 1 - i))){
                return false;
            }

        }

        return true;
    }

}
