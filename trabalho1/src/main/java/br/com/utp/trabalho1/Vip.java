package main.java.br.com.utp.trabalho1;

public class Vip extends Ticket {
    private float additional;

    public Vip(float price, float additional) {
        super(price + additional);
        this.additional = additional;
    }

    public static void printValue(String type, float price){
        System.out.println("Ingresso: " + type + " Valor: " + price);
    }

    public float getAdditional() {
        return additional;
    }
}
