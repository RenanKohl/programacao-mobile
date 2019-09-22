package main.java.br.com.utp.trabalho1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Atividade 5
 * Quinto Exercício do Estudo Dirigido da disciplina de Programação Mobile
 * @author Renan Kohl
 * @version 1.0
 */
public class Atividade5 {

    public static void main(String[] args) {

        int counter = 0;
        int last = 0;

        List<String> foodList = new ArrayList<>();

        foodList.add("ovos");
        foodList.add("leite");
        foodList.add("açucar");
        foodList.add("chocolate");
        foodList.add("farinha");

        System.out.println("Criação da lista");
        printListItem(foodList);

        System.out.println("Removendo último elemento:");
        foodList.remove(foodList.size()-1);
        printListItem(foodList);

        System.out.println("Adicionando café como primiro elemento:");
        foodList.add(0, "café");
        printListItem(foodList);

        System.out.println("Alterando açucar por mel:");
        foodList.set(foodList.indexOf("açucar"), "mel");
        printListItem(foodList);

        System.out.println("Posição do elemento leite:");
        System.out.println(foodList.indexOf("leite"));
        System.out.println();

        System.out.println("Ordenando lista:");
        Collections.sort(foodList);
        printListItem(foodList);
    }

    public static void printListItem(List<String> list){
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println();
    }
}
