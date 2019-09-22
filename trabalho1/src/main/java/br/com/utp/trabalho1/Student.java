package main.java.br.com.utp.trabalho1;

public class Student {
    private String name;
    private double firstNote;
    private double secondNote;


    public Student(){

    }
    public Student(String name, double firstNote, double secondNote){
        this.name = name;
        this.firstNote = isValidNote(firstNote);;
        this.secondNote = isValidNote(secondNote);;
    }

    public String getName() {
        return name;
    }

    public double getFirstNote() {
        return firstNote;
    }

    public double getSecondNote() {
        return secondNote;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstNote(double firstNote) {
        this.firstNote = isValidNote(firstNote);
    }

    public void setSecondNote(double secondNote){
        this.secondNote = isValidNote(secondNote);
    }

    private double isValidNote(double note){

        try{
            if(note <= 10){
               return note;
            }
            else {
                throw new InvalidNoteException("A nota não pode ser maior do que 10!");
            }
        }catch (InvalidNoteException e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public double calculateAverage(double firstNote, double secondNote){
        return (firstNote + secondNote) / 2;
    }

    public void studentSituation(String name, double average){
        if(average < 4){
            System.out.println("Situação do aluno: " + name);
            System.out.println("Reprovado");
            System.out.println("Nota: " + average);
        }else if(average >= 4 && average < 7){
            System.out.println("Situação do aluno: " + name);
            System.out.println("Prova Final");
            System.out.println("Nota: " + average);
        }
        else {
            System.out.println("Situação do aluno: " + name);
            System.out.println("Aprovado");
            System.out.println("Nota: " + average);
        }
    }
}
