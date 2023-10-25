package q4;

import java.util.*;

public class ContadorDeLetras {
    public static void main(String[] args) {
        String texto = "HELLO THERE";

        
        texto = texto.toUpperCase();

    
        Map<Character, Integer> contagemLetras = new TreeMap<>();

    
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            
            if (Character.isLetter(caractere)) {
            
                contagemLetras.put(caractere, contagemLetras.getOrDefault(caractere, 0) + 1);
            }
        }

        
        for (Map.Entry<Character, Integer> entrada : contagemLetras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
