package main.java.br.com.utp.trabalho1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Atividade 3
 * Terceiro Exercício do Estudo Dirigido da disciplina de Programação Mobile
 * @author Renan Kohl
 * @version 1.0
 */
public class Atividade3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String firstWord;
        String secondWord;
        String thirdWord;
        System.out.println("Digite a primeira palavra para realizar a ordenação e pressione enter");
        firstWord = keyboard.nextLine();
        System.out.println("Digite a segunda palavra para realizar a ordenação e pressione enter");
        secondWord = keyboard.nextLine();
        System.out.println("Digite a terceira palavra para realizar a ordenação e pressione enter");
        thirdWord = keyboard.nextLine();
        words.add(firstWord);
        words.add(secondWord);
        words.add(thirdWord);

        System.out.println("As palavras digitadas foram:");

        Collections.sort(words);

        for (String string : words) {
            System.out.println(string);
        }



    }
}
