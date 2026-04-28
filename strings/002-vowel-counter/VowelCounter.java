package Algoritmos;

import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VowelCounter {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> vocales = new HashMap<Character, Integer>();

        System.out.println("Ingresa un texto");
        String texto = scanner.nextLine();
        String textoMinuscula = texto.toLowerCase();
        String textoNormalizado = Normalizer.normalize(textoMinuscula, Normalizer.Form.NFD);
        String textoLimpio = textoNormalizado.replaceAll("\\p{M}", "");

        int totalVocales = 0;

        for (int i = 0; i < textoLimpio.length(); i++){

            char letra = textoLimpio.charAt(i);

            switch (letra){
                case 'a', 'e', 'i', 'o', 'u':
                    if (vocales.containsKey(letra)){
                        vocales.put(letra, vocales.get(letra) + 1);
                    }else {
                        vocales.put(letra, 1);
                    }

                    totalVocales += 1;
                break;
            }

        }

        System.out.println("En el texto " + texto + " hay un total de " + totalVocales + " vocales.\n" +
                "Las mismas se reparten de la siguiente manera:");
        for (Map.Entry<Character, Integer> entry : vocales.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


        scanner.close();

    }

}
