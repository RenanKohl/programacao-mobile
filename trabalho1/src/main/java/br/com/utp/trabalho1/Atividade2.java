package main.java.br.com.utp.trabalho1;

import java.util.Scanner;
/**
 * Atividade 2
 * Segundo Exercício do Estudo Dirigido da disciplina de Programação Mobile
 * @author Renan Kohl
 * @version 1.0
 */
public class Atividade2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        do {
            System.out.println("Digite um número inteiro positivo para calcular quais são os números primos dentro do intervalo entre 0 e o valor da entrada");
            while (!keyboard.hasNextInt()) {
                System.out.println("Por favor digite apenas um número!");
                keyboard.next();
            }
            number = keyboard.nextInt();
        }
        while (number <= 0);
        System.out.printf("Os números primos de 0 a %d são: \n", number);
        for (int i = 2; i <= number; i++) {
            if( checkPrimeNumbers(i) ){
                System.out.println(i);
            }
        }
    }

    private static boolean checkPrimeNumbers(int number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0){
                return false;
            }
        }
        return true;
    }
}
