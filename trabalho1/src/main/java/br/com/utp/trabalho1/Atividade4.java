package main.java.br.com.utp.trabalho1;

/**
 * Atividade 4
 * Quarto Exercício do Estudo Dirigido da disciplina de Programação Mobile
 * @author Renan Kohl
 * @version 1.0
 */
public class Atividade4 {
    public static void main(String[] args) {
        //Student student1 = new Student("test fail", 12, 13);


        Student student1 = new Student("Astolfo", 4, 3.8);
        student1.studentSituation(student1.getName(), student1.calculateAverage(student1.getFirstNote(), student1.getSecondNote()));

        Student student2 = new Student("Jubileu", 7, 5.7);
        student2.studentSituation(student2.getName(), student2.calculateAverage(student2.getFirstNote(), student2.getSecondNote()));

        Student student3 = new Student("Mirna", 9.8, 8.7);
        student3.studentSituation(student3.getName(), student3.calculateAverage(student3.getFirstNote(), student3.getSecondNote()));

        Student student4 = new Student("Jocrécio", 11, 15);



    }
}
