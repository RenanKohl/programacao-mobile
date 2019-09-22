package main.java.br.com.utp.trabalho1;

import java.util.Scanner;
/**
 * Atividade 1
 * Primeiro Exercício do Estudo Dirigido da disciplina de Programação Mobile
 * @author Renan Kohl
 * @version 1.0
 */
public class Atividade1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number1;
        int number2;
        do {
            System.out.println("Digite o primeiro número e pressione enter");
            while (!keyboard.hasNextInt()) {
                System.out.println("Por favor digite apenas números!");
                keyboard.next();
            }
            number1 = keyboard.nextInt();
            System.out.println("Digite o segundo número e pressione enter");
            while (!keyboard.hasNextInt()) {
                System.out.println("Por favor digite apenas números!");
                keyboard.next();
            }
            number2 = keyboard.nextInt();

        }  while (number2 <= 0);


        if(number2 > number1){
            System.out.printf("O valor %d é maior\n", number2);
            System.out.printf("O valor %d é menor", number1);
        }else if(number2 < number1){
            System.out.printf("O valor %d é maior\n", number1);
            System.out.printf("O valor é %d é menor", number2);
        }else{
            System.out.printf("Os valores são iguais");
        }

    }

}
